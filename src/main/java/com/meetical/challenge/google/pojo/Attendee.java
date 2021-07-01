
package com.meetical.challenge.google.pojo;

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
    "email",
    "responseStatus",
    "organizer",
    "self"
})
@Generated("jsonschema2pojo")
public class Attendee {

    @JsonProperty("email")
    private String email;
    @JsonProperty("responseStatus")
    private String responseStatus;
    @JsonProperty("organizer")
    private boolean organizer;
    @JsonProperty("self")
    private boolean self;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Attendee() {
    }

    /**
     * 
     * @param organizer
     * @param self
     * @param responseStatus
     * @param email
     */
    public Attendee(String email, String responseStatus, boolean organizer, boolean self) {
        super();
        this.email = email;
        this.responseStatus = responseStatus;
        this.organizer = organizer;
        this.self = self;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("responseStatus")
    public String getResponseStatus() {
        return responseStatus;
    }

    @JsonProperty("responseStatus")
    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    @JsonProperty("organizer")
    public boolean isOrganizer() {
        return organizer;
    }

    @JsonProperty("organizer")
    public void setOrganizer(boolean organizer) {
        this.organizer = organizer;
    }

    @JsonProperty("self")
    public boolean isSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(boolean self) {
        this.self = self;
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
        sb.append(Attendee.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("responseStatus");
        sb.append('=');
        sb.append(((this.responseStatus == null)?"<null>":this.responseStatus));
        sb.append(',');
        sb.append("organizer");
        sb.append('=');
        sb.append(this.organizer);
        sb.append(',');
        sb.append("self");
        sb.append('=');
        sb.append(this.self);
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
        result = ((result* 31)+(this.self? 1 : 0));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.responseStatus == null)? 0 :this.responseStatus.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        result = ((result* 31)+(this.organizer? 1 : 0));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Attendee) == false) {
            return false;
        }
        Attendee rhs = ((Attendee) other);
        return (((((this.self == rhs.self)&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.responseStatus == rhs.responseStatus)||((this.responseStatus!= null)&&this.responseStatus.equals(rhs.responseStatus))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&(this.organizer == rhs.organizer));
    }

}
