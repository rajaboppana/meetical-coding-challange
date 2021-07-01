
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
    "email",
    "isOrganizer",
    "isResource",
    "responseStatus"
})
@Generated("jsonschema2pojo")
public class MeeticalAttendee {

    @JsonProperty("email")
    private String email;
    @JsonProperty("isOrganizer")
    private int isOrganizer;
    @JsonProperty("isResource")
    private int isResource;
    @JsonProperty("responseStatus")
    private String responseStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public MeeticalAttendee() {
    }

    /**
     * 
     * @param isOrganizer
     * @param isResource
     * @param responseStatus
     * @param email
     */
    public MeeticalAttendee(String email, int isOrganizer, int isResource, String responseStatus) {
        super();
        this.email = email;
        this.isOrganizer = isOrganizer;
        this.isResource = isResource;
        this.responseStatus = responseStatus;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("isOrganizer")
    public int getIsOrganizer() {
        return isOrganizer;
    }

    @JsonProperty("isOrganizer")
    public void setIsOrganizer(int isOrganizer) {
        this.isOrganizer = isOrganizer;
    }

    @JsonProperty("isResource")
    public int getIsResource() {
        return isResource;
    }

    @JsonProperty("isResource")
    public void setIsResource(int isResource) {
        this.isResource = isResource;
    }

    @JsonProperty("responseStatus")
    public String getResponseStatus() {
        return responseStatus;
    }

    @JsonProperty("responseStatus")
    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
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
        sb.append(MeeticalAttendee.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("isOrganizer");
        sb.append('=');
        sb.append(this.isOrganizer);
        sb.append(',');
        sb.append("isResource");
        sb.append('=');
        sb.append(this.isResource);
        sb.append(',');
        sb.append("responseStatus");
        sb.append('=');
        sb.append(((this.responseStatus == null)?"<null>":this.responseStatus));
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
        result = ((result* 31)+ this.isOrganizer);
        result = ((result* 31)+ this.isResource);
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.responseStatus == null)? 0 :this.responseStatus.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MeeticalAttendee) == false) {
            return false;
        }
        MeeticalAttendee rhs = ((MeeticalAttendee) other);
        return (((((this.isOrganizer == rhs.isOrganizer)&&(this.isResource == rhs.isResource))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.responseStatus == rhs.responseStatus)||((this.responseStatus!= null)&&this.responseStatus.equals(rhs.responseStatus))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }

}
