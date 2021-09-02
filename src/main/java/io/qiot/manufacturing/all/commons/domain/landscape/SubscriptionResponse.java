/**
 * 
 */
package io.qiot.manufacturing.all.commons.domain.landscape;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * Object containing the response from the plant manager or the facility manager
 * 
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public class SubscriptionResponse {

    @JsonProperty("id")
    public UUID id;
    @JsonProperty("truststore")
    public String truststore;
    @JsonProperty("keystore")
    public String keystore;
}
