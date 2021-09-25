
package com.meetical.client.model.google;

import java.util.List;

import lombok.Data;


@Data
public class Item {

    public String kind;
    public String etag;
    public String id;
    public String status;
    public String htmlLink;
    public String created;
    public String updated;
    public String summary;
    public String description;
    public Creator creator;
    public Organizer organizer;
    public Start start;
    public End end;
    public List<String> recurrence = null;
    public String iCalUID;
    public Integer sequence;
    public ExtendedProperties extendedProperties;
    public Reminders reminders;
    public String eventType;
    public String recurringEventId;
    public OriginalStartTime originalStartTime;
    public List<Attendee> attendees = null;

}
