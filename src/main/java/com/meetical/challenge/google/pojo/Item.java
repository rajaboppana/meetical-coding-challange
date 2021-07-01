
package com.meetical.challenge.google.pojo;

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
    "kind",
    "etag",
    "id",
    "status",
    "htmlLink",
    "created",
    "updated",
    "summary",
    "description",
    "creator",
    "organizer",
    "start",
    "end",
    "recurrence",
    "iCalUID",
    "sequence",
    "extendedProperties",
    "reminders",
    "eventType",
    "recurringEventId",
    "originalStartTime",
    "attendees",
    "location"
})
@Generated("jsonschema2pojo")
public class Item {

    @JsonProperty("kind")
    private String kind;
    @JsonProperty("etag")
    private String etag;
    @JsonProperty("id")
    private String id;
    @JsonProperty("status")
    private String status;
    @JsonProperty("htmlLink")
    private String htmlLink;
    @JsonProperty("created")
    private String created;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("description")
    private String description;
    @JsonProperty("creator")
    private Creator creator;
    @JsonProperty("organizer")
    private Organizer organizer;
    @JsonProperty("start")
    private Start start;
    @JsonProperty("end")
    private End end;
    @JsonProperty("recurrence")
    private List<String> recurrence = null;
    @JsonProperty("iCalUID")
    private String iCalUID;
    @JsonProperty("sequence")
    private int sequence;
    @JsonProperty("extendedProperties")
    private ExtendedProperties extendedProperties;
    @JsonProperty("reminders")
    private Reminders reminders;
    @JsonProperty("eventType")
    private String eventType;
    @JsonProperty("recurringEventId")
    private String recurringEventId;
    @JsonProperty("originalStartTime")
    private OriginalStartTime originalStartTime;
    @JsonProperty("attendees")
    private List<Attendee> attendees = null;
    @JsonProperty("location")
    private String location;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param summary
     * @param reminders
     * @param creator
     * @param kind
     * @param htmlLink
     * @param created
     * @param attendees
     * @param iCalUID
     * @param start
     * @param description
     * @param originalStartTime
     * @param eventType
     * @param recurrence
     * @param sequence
     * @param extendedProperties
     * @param recurringEventId
     * @param organizer
     * @param etag
     * @param end
     * @param location
     * @param id
     * @param updated
     * @param status
     */
    public Item(String kind, String etag, String id, String status, String htmlLink, String created, String updated, String summary, String description, Creator creator, Organizer organizer, Start start, End end, List<String> recurrence, String iCalUID, int sequence, ExtendedProperties extendedProperties, Reminders reminders, String eventType, String recurringEventId, OriginalStartTime originalStartTime, List<Attendee> attendees, String location) {
        super();
        this.kind = kind;
        this.etag = etag;
        this.id = id;
        this.status = status;
        this.htmlLink = htmlLink;
        this.created = created;
        this.updated = updated;
        this.summary = summary;
        this.description = description;
        this.creator = creator;
        this.organizer = organizer;
        this.start = start;
        this.end = end;
        this.recurrence = recurrence;
        this.iCalUID = iCalUID;
        this.sequence = sequence;
        this.extendedProperties = extendedProperties;
        this.reminders = reminders;
        this.eventType = eventType;
        this.recurringEventId = recurringEventId;
        this.originalStartTime = originalStartTime;
        this.attendees = attendees;
        this.location = location;
    }

    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    @JsonProperty("etag")
    public String getEtag() {
        return etag;
    }

    @JsonProperty("etag")
    public void setEtag(String etag) {
        this.etag = etag;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("htmlLink")
    public String getHtmlLink() {
        return htmlLink;
    }

    @JsonProperty("htmlLink")
    public void setHtmlLink(String htmlLink) {
        this.htmlLink = htmlLink;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
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

    @JsonProperty("creator")
    public Creator getCreator() {
        return creator;
    }

    @JsonProperty("creator")
    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    @JsonProperty("organizer")
    public Organizer getOrganizer() {
        return organizer;
    }

    @JsonProperty("organizer")
    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    @JsonProperty("start")
    public Start getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(Start start) {
        this.start = start;
    }

    @JsonProperty("end")
    public End getEnd() {
        return end;
    }

    @JsonProperty("end")
    public void setEnd(End end) {
        this.end = end;
    }

    @JsonProperty("recurrence")
    public List<String> getRecurrence() {
        return recurrence;
    }

    @JsonProperty("recurrence")
    public void setRecurrence(List<String> recurrence) {
        this.recurrence = recurrence;
    }

    @JsonProperty("iCalUID")
    public String getiCalUID() {
        return iCalUID;
    }

    @JsonProperty("iCalUID")
    public void setiCalUID(String iCalUID) {
        this.iCalUID = iCalUID;
    }

    @JsonProperty("sequence")
    public int getSequence() {
        return sequence;
    }

    @JsonProperty("sequence")
    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    @JsonProperty("extendedProperties")
    public ExtendedProperties getExtendedProperties() {
        return extendedProperties;
    }

    @JsonProperty("extendedProperties")
    public void setExtendedProperties(ExtendedProperties extendedProperties) {
        this.extendedProperties = extendedProperties;
    }

    @JsonProperty("reminders")
    public Reminders getReminders() {
        return reminders;
    }

    @JsonProperty("reminders")
    public void setReminders(Reminders reminders) {
        this.reminders = reminders;
    }

    @JsonProperty("eventType")
    public String getEventType() {
        return eventType;
    }

    @JsonProperty("eventType")
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @JsonProperty("recurringEventId")
    public String getRecurringEventId() {
        return recurringEventId;
    }

    @JsonProperty("recurringEventId")
    public void setRecurringEventId(String recurringEventId) {
        this.recurringEventId = recurringEventId;
    }

    @JsonProperty("originalStartTime")
    public OriginalStartTime getOriginalStartTime() {
        return originalStartTime;
    }

    @JsonProperty("originalStartTime")
    public void setOriginalStartTime(OriginalStartTime originalStartTime) {
        this.originalStartTime = originalStartTime;
    }

    @JsonProperty("attendees")
    public List<Attendee> getAttendees() {
        return attendees;
    }

    @JsonProperty("attendees")
    public void setAttendees(List<Attendee> attendees) {
        this.attendees = attendees;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
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
        sb.append(Item.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null)?"<null>":this.kind));
        sb.append(',');
        sb.append("etag");
        sb.append('=');
        sb.append(((this.etag == null)?"<null>":this.etag));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("htmlLink");
        sb.append('=');
        sb.append(((this.htmlLink == null)?"<null>":this.htmlLink));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("updated");
        sb.append('=');
        sb.append(((this.updated == null)?"<null>":this.updated));
        sb.append(',');
        sb.append("summary");
        sb.append('=');
        sb.append(((this.summary == null)?"<null>":this.summary));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("creator");
        sb.append('=');
        sb.append(((this.creator == null)?"<null>":this.creator));
        sb.append(',');
        sb.append("organizer");
        sb.append('=');
        sb.append(((this.organizer == null)?"<null>":this.organizer));
        sb.append(',');
        sb.append("start");
        sb.append('=');
        sb.append(((this.start == null)?"<null>":this.start));
        sb.append(',');
        sb.append("end");
        sb.append('=');
        sb.append(((this.end == null)?"<null>":this.end));
        sb.append(',');
        sb.append("recurrence");
        sb.append('=');
        sb.append(((this.recurrence == null)?"<null>":this.recurrence));
        sb.append(',');
        sb.append("iCalUID");
        sb.append('=');
        sb.append(((this.iCalUID == null)?"<null>":this.iCalUID));
        sb.append(',');
        sb.append("sequence");
        sb.append('=');
        sb.append(this.sequence);
        sb.append(',');
        sb.append("extendedProperties");
        sb.append('=');
        sb.append(((this.extendedProperties == null)?"<null>":this.extendedProperties));
        sb.append(',');
        sb.append("reminders");
        sb.append('=');
        sb.append(((this.reminders == null)?"<null>":this.reminders));
        sb.append(',');
        sb.append("eventType");
        sb.append('=');
        sb.append(((this.eventType == null)?"<null>":this.eventType));
        sb.append(',');
        sb.append("recurringEventId");
        sb.append('=');
        sb.append(((this.recurringEventId == null)?"<null>":this.recurringEventId));
        sb.append(',');
        sb.append("originalStartTime");
        sb.append('=');
        sb.append(((this.originalStartTime == null)?"<null>":this.originalStartTime));
        sb.append(',');
        sb.append("attendees");
        sb.append('=');
        sb.append(((this.attendees == null)?"<null>":this.attendees));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
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
        result = ((result* 31)+((this.reminders == null)? 0 :this.reminders.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.extendedProperties == null)? 0 :this.extendedProperties.hashCode()));
        result = ((result* 31)+((this.recurringEventId == null)? 0 :this.recurringEventId.hashCode()));
        result = ((result* 31)+((this.end == null)? 0 :this.end.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.summary == null)? 0 :this.summary.hashCode()));
        result = ((result* 31)+((this.creator == null)? 0 :this.creator.hashCode()));
        result = ((result* 31)+((this.kind == null)? 0 :this.kind.hashCode()));
        result = ((result* 31)+((this.htmlLink == null)? 0 :this.htmlLink.hashCode()));
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        result = ((result* 31)+((this.attendees == null)? 0 :this.attendees.hashCode()));
        result = ((result* 31)+((this.iCalUID == null)? 0 :this.iCalUID.hashCode()));
        result = ((result* 31)+((this.start == null)? 0 :this.start.hashCode()));
        result = ((result* 31)+((this.originalStartTime == null)? 0 :this.originalStartTime.hashCode()));
        result = ((result* 31)+((this.eventType == null)? 0 :this.eventType.hashCode()));
        result = ((result* 31)+((this.recurrence == null)? 0 :this.recurrence.hashCode()));
        result = ((result* 31)+ this.sequence);
        result = ((result* 31)+((this.organizer == null)? 0 :this.organizer.hashCode()));
        result = ((result* 31)+((this.etag == null)? 0 :this.etag.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.updated == null)? 0 :this.updated.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Item) == false) {
            return false;
        }
        Item rhs = ((Item) other);
        return (((((((((((((((((((((((((this.reminders == rhs.reminders)||((this.reminders!= null)&&this.reminders.equals(rhs.reminders)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.extendedProperties == rhs.extendedProperties)||((this.extendedProperties!= null)&&this.extendedProperties.equals(rhs.extendedProperties))))&&((this.recurringEventId == rhs.recurringEventId)||((this.recurringEventId!= null)&&this.recurringEventId.equals(rhs.recurringEventId))))&&((this.end == rhs.end)||((this.end!= null)&&this.end.equals(rhs.end))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.summary == rhs.summary)||((this.summary!= null)&&this.summary.equals(rhs.summary))))&&((this.creator == rhs.creator)||((this.creator!= null)&&this.creator.equals(rhs.creator))))&&((this.kind == rhs.kind)||((this.kind!= null)&&this.kind.equals(rhs.kind))))&&((this.htmlLink == rhs.htmlLink)||((this.htmlLink!= null)&&this.htmlLink.equals(rhs.htmlLink))))&&((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created))))&&((this.attendees == rhs.attendees)||((this.attendees!= null)&&this.attendees.equals(rhs.attendees))))&&((this.iCalUID == rhs.iCalUID)||((this.iCalUID!= null)&&this.iCalUID.equals(rhs.iCalUID))))&&((this.start == rhs.start)||((this.start!= null)&&this.start.equals(rhs.start))))&&((this.originalStartTime == rhs.originalStartTime)||((this.originalStartTime!= null)&&this.originalStartTime.equals(rhs.originalStartTime))))&&((this.eventType == rhs.eventType)||((this.eventType!= null)&&this.eventType.equals(rhs.eventType))))&&((this.recurrence == rhs.recurrence)||((this.recurrence!= null)&&this.recurrence.equals(rhs.recurrence))))&&(this.sequence == rhs.sequence))&&((this.organizer == rhs.organizer)||((this.organizer!= null)&&this.organizer.equals(rhs.organizer))))&&((this.etag == rhs.etag)||((this.etag!= null)&&this.etag.equals(rhs.etag))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.updated == rhs.updated)||((this.updated!= null)&&this.updated.equals(rhs.updated))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
