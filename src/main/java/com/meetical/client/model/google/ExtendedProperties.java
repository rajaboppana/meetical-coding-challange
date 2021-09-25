
package com.meetical.client.model.google;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;


@Data
public class ExtendedProperties {

	@JsonProperty("private")
    public Private _private;

}
