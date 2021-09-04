package io.qiot.manufacturing.all.commons.domain.landscape;

import java.time.Instant;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public abstract class AbstractLandscapeDTO  {
    public UUID id;
    public String serial;
    public String name;
    @JsonProperty(value = "registered_on")
    public Instant registeredOn;
    
    
}