package com.meetical.client.service;

import java.util.ArrayList;
import java.util.List;

import com.meetical.client.model.google.Attendee;
import com.meetical.client.model.google.Item;
import com.meetical.client.model.google.MeeticalGoogle;
import com.meetical.model.Event;
import com.meetical.model.MeeticalAttendee;
import com.meetical.model.MeeticalObject;

public class MeeticalClientServiceTransformer {

	public static List<MeeticalObject> transform(MeeticalGoogle meeticalGoogleObject) {
		List<MeeticalObject> meeticalObjects = new ArrayList<MeeticalObject>();

		List<Item> items = meeticalGoogleObject.getItems();
		for (Item item : items) {
			MeeticalObject meeticalObject = new MeeticalObject();
			meeticalObject.setCalendarId(meeticalGoogleObject.getEtag());
			meeticalObject.setIsMeeticalPage(1);
			meeticalObject.setMeetingPageType(meeticalGoogleObject.getNextPageToken());
			meeticalObject.setCalendarProvider("GOOGLE");

			Event event = new Event();
			event.setDescription(item.getDescription());
			event.setIsCancelled(item.getStatus().equals("cancelled") ? 1 : 0);
			event.setEndDateTime(item.getEnd().getDateTime());
			event.setStartDateTime(item.getStart().getDateTime());
			event.setRecurringEventId(item.getRecurringEventId());
			event.setSummary(item.getSummary());
			event.setRecurringEventId(item.getRecurringEventId());
			event.setId(item.getId());
			event.setCalendarHtmlLinkProxy(item.getHtmlLink());
			setMeeticalAttendees(event, item);

			meeticalObject.setEvent(event);
			meeticalObjects.add(meeticalObject);
		}

		return meeticalObjects;
	}

	private static void setMeeticalAttendees(Event event, Item item) {
		List<Attendee> googleAttendees = item.getAttendees();
		if (googleAttendees != null) {
			List<MeeticalAttendee> meeticalAttendees = new ArrayList<MeeticalAttendee>();

			for (Attendee attendee : googleAttendees) {
				MeeticalAttendee meeticalAttendee = new MeeticalAttendee();
				meeticalAttendee.setEmail(attendee.getEmail());
				meeticalAttendee.setIsOrganizer(item.getOrganizer().getSelf() ? 1 : 0);
				meeticalAttendee.setResponseStatus(attendee.getResponseStatus());

				meeticalAttendees.add(meeticalAttendee);
			}

			event.setAttendees(meeticalAttendees);
		}
	}

}
