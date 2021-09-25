
package com.meetical.client.model.microsoft;

import java.util.List;

import lombok.Data;

@Data
public class MeeticalMicrosoft {

    public String odataContext;
    public List<Value> value = null;

}
