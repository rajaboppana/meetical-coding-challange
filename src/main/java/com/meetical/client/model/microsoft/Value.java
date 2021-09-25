
package com.meetical.client.model.microsoft;

import java.util.List;

import lombok.Data;

@Data
public class Value {

    public String odataEtag;
    public String id;
    public String createdDateTime;
    public String lastModifiedDateTime;
    public String changeKey;
    public List<Object> categories = null;
    public Object transactionId;
    public String originalStartTimeZone;
    public String originalEndTimeZone;
    public String iCalUId;
    public Integer reminderMinutesBeforeStart;
    public Boolean isReminderOn;
    public Boolean hasAttachments;
    public String subject;
    public String bodyPreview;
    public String importance;
    public String sensitivity;
    public Boolean isAllDay;
    public Boolean isCancelled;
    public Boolean isOrganizer;
    public Boolean responseRequested;
    public Object seriesMasterId;
    public String showAs;
    public String type;
    public String webLink;
    public Object onlineMeetingUrl;
    public Boolean isOnlineMeeting;
    public String onlineMeetingProvider;
    public Boolean allowNewTimeProposals;
    public Boolean isDraft;
    public Boolean hideAttendees;
    public Object onlineMeeting;
    public ResponseStatus responseStatus;
    public Body body;
    public Start start;
    public End end;
    public Location location;
    public List<Object> locations = null;
    public Object recurrence;
    public List<Attendee> attendees = null;
    public Organizer organizer;

}
