
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
    "everyoneDeclinedDismissed"
})
@Generated("jsonschema2pojo")
public class Private {

    @JsonProperty("everyoneDeclinedDismissed")
    private String everyoneDeclinedDismissed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Private() {
    }

    /**
     * 
     * @param everyoneDeclinedDismissed
     */
    public Private(String everyoneDeclinedDismissed) {
        super();
        this.everyoneDeclinedDismissed = everyoneDeclinedDismissed;
    }

    @JsonProperty("everyoneDeclinedDismissed")
    public String getEveryoneDeclinedDismissed() {
        return everyoneDeclinedDismissed;
    }

    @JsonProperty("everyoneDeclinedDismissed")
    public void setEveryoneDeclinedDismissed(String everyoneDeclinedDismissed) {
        this.everyoneDeclinedDismissed = everyoneDeclinedDismissed;
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
        sb.append(Private.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("everyoneDeclinedDismissed");
        sb.append('=');
        sb.append(((this.everyoneDeclinedDismissed == null)?"<null>":this.everyoneDeclinedDismissed));
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
        result = ((result* 31)+((this.everyoneDeclinedDismissed == null)? 0 :this.everyoneDeclinedDismissed.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Private) == false) {
            return false;
        }
        Private rhs = ((Private) other);
        return (((this.everyoneDeclinedDismissed == rhs.everyoneDeclinedDismissed)||((this.everyoneDeclinedDismissed!= null)&&this.everyoneDeclinedDismissed.equals(rhs.everyoneDeclinedDismissed)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
