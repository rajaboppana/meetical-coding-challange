
package com.meetical.challenge.meetical.pojo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isMeeticalPage",
    "event",
    "calendarId",
    "templateId",
    "subPageTemplateId",
    "meetingPageType",
    "calendarProvider",
    "recurringAutomation"
})
@Generated("jsonschema2pojo")
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public MeeticalObject() {
    }

    /**
     * 
     * @param meetingPageType
     * @param calendarId
     * @param calendarProvider
     * @param recurringAutomation
     * @param event
     * @param templateId
     * @param isMeeticalPage
     * @param subPageTemplateId
     */
    public MeeticalObject(int isMeeticalPage, Event event, String calendarId, int templateId, Object subPageTemplateId, String meetingPageType, String calendarProvider, Object recurringAutomation) {
        super();
        this.isMeeticalPage = isMeeticalPage;
        this.event = event;
        this.calendarId = calendarId;
        this.templateId = templateId;
        this.subPageTemplateId = subPageTemplateId;
        this.meetingPageType = meetingPageType;
        this.calendarProvider = calendarProvider;
        this.recurringAutomation = recurringAutomation;
    }

    @JsonProperty("isMeeticalPage")
    public int getIsMeeticalPage() {
        return isMeeticalPage;
    }

    @JsonProperty("isMeeticalPage")
    public void setIsMeeticalPage(int isMeeticalPage) {
        this.isMeeticalPage = isMeeticalPage;
    }

    @JsonProperty("event")
    public Event getEvent() {
        return event;
    }

    @JsonProperty("event")
    public void setEvent(Event event) {
        this.event = event;
    }

    @JsonProperty("calendarId")
    public String getCalendarId() {
        return calendarId;
    }

    @JsonProperty("calendarId")
    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    @JsonProperty("templateId")
    public int getTemplateId() {
        return templateId;
    }

    @JsonProperty("templateId")
    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    @JsonProperty("subPageTemplateId")
    public Object getSubPageTemplateId() {
        return subPageTemplateId;
    }

    @JsonProperty("subPageTemplateId")
    public void setSubPageTemplateId(Object subPageTemplateId) {
        this.subPageTemplateId = subPageTemplateId;
    }

    @JsonProperty("meetingPageType")
    public String getMeetingPageType() {
        return meetingPageType;
    }

    @JsonProperty("meetingPageType")
    public void setMeetingPageType(String meetingPageType) {
        this.meetingPageType = meetingPageType;
    }

    @JsonProperty("calendarProvider")
    public String getCalendarProvider() {
        return calendarProvider;
    }

    @JsonProperty("calendarProvider")
    public void setCalendarProvider(String calendarProvider) {
        this.calendarProvider = calendarProvider;
    }

    @JsonProperty("recurringAutomation")
    public Object getRecurringAutomation() {
        return recurringAutomation;
    }

    @JsonProperty("recurringAutomation")
    public void setRecurringAutomation(Object recurringAutomation) {
        this.recurringAutomation = recurringAutomation;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MeeticalObject.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isMeeticalPage");
        sb.append('=');
        sb.append(this.isMeeticalPage);
        sb.append(',');
        sb.append("event");
        sb.append('=');
        sb.append(((this.event == null)?"<null>":this.event));
        sb.append(',');
        sb.append("calendarId");
        sb.append('=');
        sb.append(((this.calendarId == null)?"<null>":this.calendarId));
        sb.append(',');
        sb.append("templateId");
        sb.append('=');
        sb.append(this.templateId);
        sb.append(',');
        sb.append("subPageTemplateId");
        sb.append('=');
        sb.append(((this.subPageTemplateId == null)?"<null>":this.subPageTemplateId));
        sb.append(',');
        sb.append("meetingPageType");
        sb.append('=');
        sb.append(((this.meetingPageType == null)?"<null>":this.meetingPageType));
        sb.append(',');
        sb.append("calendarProvider");
        sb.append('=');
        sb.append(((this.calendarProvider == null)?"<null>":this.calendarProvider));
        sb.append(',');
        sb.append("recurringAutomation");
        sb.append('=');
        sb.append(((this.recurringAutomation == null)?"<null>":this.recurringAutomation));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.meetingPageType == null)? 0 :this.meetingPageType.hashCode()));
        result = ((result* 31)+((this.calendarId == null)? 0 :this.calendarId.hashCode()));
        result = ((result* 31)+((this.calendarProvider == null)? 0 :this.calendarProvider.hashCode()));
        result = ((result* 31)+((this.recurringAutomation == null)? 0 :this.recurringAutomation.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.event == null)? 0 :this.event.hashCode()));
        result = ((result* 31)+ this.templateId);
        result = ((result* 31)+ this.isMeeticalPage);
        result = ((result* 31)+((this.subPageTemplateId == null)? 0 :this.subPageTemplateId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MeeticalObject) == false) {
            return false;
        }
        MeeticalObject rhs = ((MeeticalObject) other);
        return ((((((((((this.meetingPageType == rhs.meetingPageType)||((this.meetingPageType!= null)&&this.meetingPageType.equals(rhs.meetingPageType)))&&((this.calendarId == rhs.calendarId)||((this.calendarId!= null)&&this.calendarId.equals(rhs.calendarId))))&&((this.calendarProvider == rhs.calendarProvider)||((this.calendarProvider!= null)&&this.calendarProvider.equals(rhs.calendarProvider))))&&((this.recurringAutomation == rhs.recurringAutomation)||((this.recurringAutomation!= null)&&this.recurringAutomation.equals(rhs.recurringAutomation))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.event == rhs.event)||((this.event!= null)&&this.event.equals(rhs.event))))&&(this.templateId == rhs.templateId))&&(this.isMeeticalPage == rhs.isMeeticalPage))&&((this.subPageTemplateId == rhs.subPageTemplateId)||((this.subPageTemplateId!= null)&&this.subPageTemplateId.equals(rhs.subPageTemplateId))));
    }

}
