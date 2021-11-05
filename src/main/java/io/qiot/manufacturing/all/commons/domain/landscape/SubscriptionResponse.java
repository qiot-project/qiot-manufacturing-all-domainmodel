/**
 * 
 */
package io.qiot.manufacturing.all.commons.domain.landscape;

import java.time.Instant;
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
    @JsonProperty("tlsCert")
    public String tlsCert;
    @JsonProperty("tlsKey")
    public String tlsKey;
    @JsonProperty("subscribed_on")
    public Instant subscribedOn;
}
