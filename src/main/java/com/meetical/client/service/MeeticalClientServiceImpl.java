package com.meetical.client.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.meetical.client.model.google.Attendee;
import com.meetical.client.model.google.Item;
import com.meetical.client.model.google.MeeticalGoogle;
import com.meetical.client.model.microsoft.MeeticalMicrosoft;
import com.meetical.client.model.microsoft.Value;
import com.meetical.model.Event;
import com.meetical.model.MeeticalAttendee;
import com.meetical.model.MeeticalObject;

@Service
public class MeeticalClientServiceImpl implements MeeticalClientService {

	@Override
	public List<MeeticalObject> getMeetings(String user) throws MeeticalClientException {

		if ("anna" == user) {

			return getGoogleMeetings();

		} else if ("john" == user) {

			return getMicrosoftMeetings();

		} else {
			throw new MeeticalClientException();
		}

	}

	private List<MeeticalObject> getGoogleMeetings() throws MeeticalClientException {
		List<MeeticalObject> meeticalObjects = new ArrayList<MeeticalObject>();

		try {
			// create object mapper instance
			ObjectMapper mapper = new ObjectMapper();

			BufferedReader br = new BufferedReader(
					new FileReader("src/main/resources/google-event-data-anna-berlin.json"));

			MeeticalGoogle meeticalGoogleObject = mapper.readValue(br, MeeticalGoogle.class);

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

				List<Attendee> googleAttendees = item.getAttendees();

				if (googleAttendees == null || googleAttendees.isEmpty() ) {
					List<MeeticalAttendee> meeticalAttendees = new ArrayList<MeeticalAttendee>();
					event.setAttendees(meeticalAttendees);
				} else {
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

				event.setRecurringEventId(item.getRecurringEventId());
				event.setId(item.getId());
				event.setCalendarHtmlLinkProxy(item.getHtmlLink());

				meeticalObject.setEvent(event);
				meeticalObjects.add(meeticalObject);
			}

		} catch (IOException ex) {
			throw new MeeticalClientException(ex.getMessage());
		}

		return meeticalObjects;
	}

	private List<MeeticalObject> getMicrosoftMeetings() {
		List<MeeticalObject> meeticalObjects = new ArrayList<MeeticalObject>();

		try {
			// create object mapper instance
			ObjectMapper mapper = new ObjectMapper();

			BufferedReader br = new BufferedReader(new FileReader("src/main/resources/microsoft-event-data.json"));

			MeeticalMicrosoft meeticalMicrosoftObject = mapper.readValue(br, MeeticalMicrosoft.class);

			List<Value> values = meeticalMicrosoftObject.getValue();

			for (Value value : values) {
				MeeticalObject meeticalObject = new MeeticalObject();

				meeticalObject.setCalendarId(value.getICalUId());
				meeticalObject.setIsMeeticalPage(1);
				meeticalObject.setMeetingPageType(null);
				meeticalObject.setCalendarProvider("MICROSOFT");

				Event event = new Event();

				event.setDescription(value.getSubject());
				event.setIsCancelled(value.getIsCancelled() ? 1 : 0);
				event.setEndDateTime(value.getEnd().getDateTime());
				event.setStartDateTime(value.getStart().getDateTime());
				event.setRecurringEventId(value.getRecurrence().toString());

				List<com.meetical.client.model.microsoft.Attendee> attendees = value.getAttendees();

				if (attendees != null) {

					List<MeeticalAttendee> meeticalAttendees = new ArrayList<MeeticalAttendee>();

					for (com.meetical.client.model.microsoft.Attendee attendee : attendees) {
						MeeticalAttendee meeticalAttendee = new MeeticalAttendee();
						meeticalAttendee.setEmail(attendee.getEmailAddress().getAddress());
						meeticalAttendee.setIsOrganizer(value.getIsOrganizer() ? 1 : 0);
						meeticalAttendee.setResponseStatus(attendee.getStatus().getResponse());

						meeticalAttendees.add(meeticalAttendee);
					}

					event.setAttendees(meeticalAttendees);
				}
				event.setRecurringEventId(value.getRecurrence());
				event.setId(value.getId());
				event.setCalendarHtmlLinkProxy(value.getWebLink());

				meeticalObject.setEvent(event);
				meeticalObjects.add(meeticalObject);

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
