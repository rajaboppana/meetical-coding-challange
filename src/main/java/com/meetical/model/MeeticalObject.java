
package com.meetical.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MeeticalObject {

    @JsonProperty("isMeeticalPage")
    private int isMeeticalPage;
    @JsonProperty("event")
    private Event event;
    @JsonProperty("calendarId")
    private String calendarId;
    @JsonProperty("templateId")
    private int templateId;
    @JsonProperty("subPageTemplateId")
    private Object subPageTemplateId;
    @JsonProperty("meetingPageType")
    private String meetingPageType;
    @JsonProperty("calendarProvider")
    private String calendarProvider;
    @JsonProperty("recurringAutomation")
    private Object recurringAutomation;



}
