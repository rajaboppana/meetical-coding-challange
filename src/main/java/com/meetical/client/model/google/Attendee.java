
package com.meetical.client.model.google;

import lombok.Data;


@Data
public class Attendee {

    public String email;
    public String responseStatus;
    public Boolean organizer;
    public Boolean self;

}
