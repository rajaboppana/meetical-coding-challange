
package com.meetical.challenge.meetical.pojo;

import java.util.HashMap;
import java.util.List;
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
    "id",
    "isCancelled",
    "recurringEventId",
    "summary",
    "description",
    "location",
    "startDateTime",
    "endDateTime",
    "recurringRulesHumanFriendly",
    "recurringRulesRaw",
    "recurringEndDate",
    "calendarHtmlLinkProxy",
    "attendees"
})
@Generated("jsonschema2pojo")
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Event() {
    }

    /**
     * 
     * @param summary
     * @param isCancelled
     * @param calendarHtmlLinkProxy
     * @param recurringRulesHumanFriendly
     * @param recurringRulesRaw
     * @param attendees
     * @param recurringEndDate
     * @param description
     * @param endDateTime
     * @param startDateTime
     * @param recurringEventId
     * @param location
     * @param id
     */
    public Event(String id, int isCancelled, Object recurringEventId, String summary, String description, Object location, String startDateTime, String endDateTime, Object recurringRulesHumanFriendly, Object recurringRulesRaw, String recurringEndDate, String calendarHtmlLinkProxy, List<MeeticalAttendee> attendees) {
        super();
        this.id = id;
        this.isCancelled = isCancelled;
        this.recurringEventId = recurringEventId;
        this.summary = summary;
        this.description = description;
        this.location = location;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.recurringRulesHumanFriendly = recurringRulesHumanFriendly;
        this.recurringRulesRaw = recurringRulesRaw;
        this.recurringEndDate = recurringEndDate;
        this.calendarHtmlLinkProxy = calendarHtmlLinkProxy;
        this.attendees = attendees;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("isCancelled")
    public int getIsCancelled() {
        return isCancelled;
    }

    @JsonProperty("isCancelled")
    public void setIsCancelled(int isCancelled) {
        this.isCancelled = isCancelled;
    }

    @JsonProperty("recurringEventId")
    public Object getRecurringEventId() {
        return recurringEventId;
    }

    @JsonProperty("recurringEventId")
    public void setRecurringEventId(Object recurringEventId) {
        this.recurringEventId = recurringEventId;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("location")
    public Object getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Object location) {
        this.location = location;
    }

    @JsonProperty("startDateTime")
    public String getStartDateTime() {
        return startDateTime;
    }

    @JsonProperty("startDateTime")
    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    @JsonProperty("endDateTime")
    public String getEndDateTime() {
        return endDateTime;
    }

    @JsonProperty("endDateTime")
    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    @JsonProperty("recurringRulesHumanFriendly")
    public Object getRecurringRulesHumanFriendly() {
        return recurringRulesHumanFriendly;
    }

    @JsonProperty("recurringRulesHumanFriendly")
    public void setRecurringRulesHumanFriendly(Object recurringRulesHumanFriendly) {
        this.recurringRulesHumanFriendly = recurringRulesHumanFriendly;
    }

    @JsonProperty("recurringRulesRaw")
    public Object getRecurringRulesRaw() {
        return recurringRulesRaw;
    }

    @JsonProperty("recurringRulesRaw")
    public void setRecurringRulesRaw(Object recurringRulesRaw) {
        this.recurringRulesRaw = recurringRulesRaw;
    }

    @JsonProperty("recurringEndDate")
    public String getRecurringEndDate() {
        return recurringEndDate;
    }

    @JsonProperty("recurringEndDate")
    public void setRecurringEndDate(String recurringEndDate) {
        this.recurringEndDate = recurringEndDate;
    }

    @JsonProperty("calendarHtmlLinkProxy")
    public String getCalendarHtmlLinkProxy() {
        return calendarHtmlLinkProxy;
    }

    @JsonProperty("calendarHtmlLinkProxy")
    public void setCalendarHtmlLinkProxy(String calendarHtmlLinkProxy) {
        this.calendarHtmlLinkProxy = calendarHtmlLinkProxy;
    }

    @JsonProperty("attendees")
    public List<MeeticalAttendee> getAttendees() {
        return attendees;
    }

    @JsonProperty("attendees")
    public void setAttendees(List<MeeticalAttendee> attendees) {
        this.attendees = attendees;
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
        sb.append(Event.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("isCancelled");
        sb.append('=');
        sb.append(this.isCancelled);
        sb.append(',');
        sb.append("recurringEventId");
        sb.append('=');
        sb.append(((this.recurringEventId == null)?"<null>":this.recurringEventId));
        sb.append(',');
        sb.append("summary");
        sb.append('=');
        sb.append(((this.summary == null)?"<null>":this.summary));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("startDateTime");
        sb.append('=');
        sb.append(((this.startDateTime == null)?"<null>":this.startDateTime));
        sb.append(',');
        sb.append("endDateTime");
        sb.append('=');
        sb.append(((this.endDateTime == null)?"<null>":this.endDateTime));
        sb.append(',');
        sb.append("recurringRulesHumanFriendly");
        sb.append('=');
        sb.append(((this.recurringRulesHumanFriendly == null)?"<null>":this.recurringRulesHumanFriendly));
        sb.append(',');
        sb.append("recurringRulesRaw");
        sb.append('=');
        sb.append(((this.recurringRulesRaw == null)?"<null>":this.recurringRulesRaw));
        sb.append(',');
        sb.append("recurringEndDate");
        sb.append('=');
        sb.append(((this.recurringEndDate == null)?"<null>":this.recurringEndDate));
        sb.append(',');
        sb.append("calendarHtmlLinkProxy");
        sb.append('=');
        sb.append(((this.calendarHtmlLinkProxy == null)?"<null>":this.calendarHtmlLinkProxy));
        sb.append(',');
        sb.append("attendees");
        sb.append('=');
        sb.append(((this.attendees == null)?"<null>":this.attendees));
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
        result = ((result* 31)+((this.summary == null)? 0 :this.summary.hashCode()));
        result = ((result* 31)+ this.isCancelled);
        result = ((result* 31)+((this.calendarHtmlLinkProxy == null)? 0 :this.calendarHtmlLinkProxy.hashCode()));
        result = ((result* 31)+((this.recurringRulesHumanFriendly == null)? 0 :this.recurringRulesHumanFriendly.hashCode()));
        result = ((result* 31)+((this.recurringRulesRaw == null)? 0 :this.recurringRulesRaw.hashCode()));
        result = ((result* 31)+((this.attendees == null)? 0 :this.attendees.hashCode()));
        result = ((result* 31)+((this.recurringEndDate == null)? 0 :this.recurringEndDate.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.endDateTime == null)? 0 :this.endDateTime.hashCode()));
        result = ((result* 31)+((this.startDateTime == null)? 0 :this.startDateTime.hashCode()));
        result = ((result* 31)+((this.recurringEventId == null)? 0 :this.recurringEventId.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Event) == false) {
            return false;
        }
        Event rhs = ((Event) other);
        return (((((((((((((((this.summary == rhs.summary)||((this.summary!= null)&&this.summary.equals(rhs.summary)))&&(this.isCancelled == rhs.isCancelled))&&((this.calendarHtmlLinkProxy == rhs.calendarHtmlLinkProxy)||((this.calendarHtmlLinkProxy!= null)&&this.calendarHtmlLinkProxy.equals(rhs.calendarHtmlLinkProxy))))&&((this.recurringRulesHumanFriendly == rhs.recurringRulesHumanFriendly)||((this.recurringRulesHumanFriendly!= null)&&this.recurringRulesHumanFriendly.equals(rhs.recurringRulesHumanFriendly))))&&((this.recurringRulesRaw == rhs.recurringRulesRaw)||((this.recurringRulesRaw!= null)&&this.recurringRulesRaw.equals(rhs.recurringRulesRaw))))&&((this.attendees == rhs.attendees)||((this.attendees!= null)&&this.attendees.equals(rhs.attendees))))&&((this.recurringEndDate == rhs.recurringEndDate)||((this.recurringEndDate!= null)&&this.recurringEndDate.equals(rhs.recurringEndDate))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.endDateTime == rhs.endDateTime)||((this.endDateTime!= null)&&this.endDateTime.equals(rhs.endDateTime))))&&((this.startDateTime == rhs.startDateTime)||((this.startDateTime!= null)&&this.startDateTime.equals(rhs.startDateTime))))&&((this.recurringEventId == rhs.recurringEventId)||((this.recurringEventId!= null)&&this.recurringEventId.equals(rhs.recurringEventId))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
