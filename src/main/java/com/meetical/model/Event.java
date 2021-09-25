
package com.meetical.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;


@Data
public class Event {

    @JsonProperty("id")
    private String id;
    @JsonProperty("isCancelled")
    private int isCancelled;
    @JsonProperty("recurringEventId")
    private Object recurringEventId;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("description")
    private String description;
    @JsonProperty("location")
    private Object location;
    @JsonProperty("startDateTime")
    private String startDateTime;
    @JsonProperty("endDateTime")
    private String endDateTime;
    @JsonProperty("recurringRulesHumanFriendly")
    private Object recurringRulesHumanFriendly;
    @JsonProperty("recurringRulesRaw")
    private Object recurringRulesRaw;
    @JsonProperty("recurringEndDate")
    private String recurringEndDate;
    @JsonProperty("calendarHtmlLinkProxy")
    private String calendarHtmlLinkProxy;
    @JsonProperty("attendees")
    private List<MeeticalAttendee> attendees = null;

}
