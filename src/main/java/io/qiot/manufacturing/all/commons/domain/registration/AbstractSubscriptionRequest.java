package io.qiot.manufacturing.all.commons.domain.registration;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author andreabattaglia
 *
 */
public class AbstractSubscriptionRequest {

    @JsonProperty(value = "serial")
    @NotNull
    public String serial;
    
    @JsonProperty(value = "name")
    @NotNull
    @Pattern(regexp = "[a-z0-9]([-a-z0-9]*[a-z0-9])?(\\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*")
    public String name;
    
    /**
     * KeyStore Password
     * 
     */
    @JsonProperty("keyStorePassword")
    public String keyStorePassword;
    
}