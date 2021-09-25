
package com.meetical.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MeeticalAttendee {

    @JsonProperty("email")
    private String email;
    @JsonProperty("isOrganizer")
    private int isOrganizer;
    @JsonProperty("isResource")
    private int isResource;
    @JsonProperty("responseStatus")
    private String responseStatus;
    
    

}
