package com.meetical.challenge.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.meetical.challenge.google.pojo.Attendee;
import com.meetical.challenge.google.pojo.GoogleJsonObject;
import com.meetical.challenge.google.pojo.Item;
import com.meetical.challenge.meetical.pojo.Event;
import com.meetical.challenge.meetical.pojo.MeeticalAttendee;
import com.meetical.challenge.meetical.pojo.MeeticalObject;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class MeeticalGoogleEventsImpl implements MeeticalService {

    @Override
    public List<MeeticalObject> getMeetings(String user) {

        List<MeeticalObject> meeticalObjects = new ArrayList<MeeticalObject>();

        try {
            // create object mapper instance
            ObjectMapper mapper = new ObjectMapper();

            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/google-event-data-anna-berlin.json"));

            GoogleJsonObject googleJsonObject = mapper.readValue(br, GoogleJsonObject.class);


            List<Item> items = googleJsonObject.getItems();

            for (Item item : googleJsonObject.getItems()) {

                MeeticalObject meeticalObject = new MeeticalObject();

                meeticalObject.setCalendarId(googleJsonObject.getEtag());
                meeticalObject.setIsMeeticalPage(1);
                meeticalObject.setMeetingPageType(googleJsonObject.getNextPageToken());
                meeticalObject.setCalendarProvider("GOOGLE");
                meeticalObject.setRecurringAutomation(null);

                Event event = new Event();

                event.setDescription(item.getDescription());

                event.setLocation(item.getLocation());
                event.setIsCancelled(item.getStatus().equals("cancelled") ? 1 : 0);
                event.setRecurringEndDate("");
                event.setSummary(item.getSummary());

                List<Attendee> googleAttendees = item.getAttendees();

                if (!(googleAttendees == null)) {

                    List<MeeticalAttendee> meeticalAttendees = new ArrayList<MeeticalAttendee>();

                    for (Attendee attendee : item.getAttendees()) {
                        MeeticalAttendee meeticalAttendee = new MeeticalAttendee();
                        meeticalAttendee.setEmail(attendee.getEmail());
                        meeticalAttendee.setIsOrganizer(item.getOrganizer().isSelf() ? 1 : 0);
                        meeticalAttendee.setIsResource(item.getOrganizer().isSelf() ? 0 : 1);
                        meeticalAttendee.setResponseStatus(attendee.getResponseStatus());

                        meeticalAttendees.add(meeticalAttendee);
                    }

                    event.setAttendees(meeticalAttendees);
                }

                event.setRecurringEventId(item.getRecurringEventId());
                event.setId(item.getId());
                event.setCalendarHtmlLinkProxy(item.getHtmlLink());

                meeticalObject.setEvent(event);

                //  System.out.println(meeticalObject);

                meeticalObjects.add(meeticalObject);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return meeticalObjects;
    }

}
