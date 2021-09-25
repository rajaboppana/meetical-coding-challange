
package com.meetical.client.model.microsoft;

import lombok.Data;

@Data
public class Location {

    public String displayName;
    public String locationType;
    public String uniqueIdType;
    public Address address;
    public Coordinates coordinates;

}
