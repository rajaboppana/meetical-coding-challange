
package com.meetical.client.model.microsoft;

import lombok.Data;

@Data
public class Attendee {

    public String type;
    public Status status;
    public EmailAddress emailAddress;

}
