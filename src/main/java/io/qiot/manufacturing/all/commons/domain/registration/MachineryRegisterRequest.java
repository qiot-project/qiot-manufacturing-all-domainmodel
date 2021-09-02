package io.qiot.manufacturing.all.commons.domain.registration;

import java.util.UUID;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class MachineryRegisterRequest {

    @JsonProperty(value = "factoryId")
    @NotNull
    public UUID factoryId;

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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("EdgeRegisterRequest [factoryId=");
        builder.append(factoryId);
        builder.append(", serial=");
        builder.append(serial);
        builder.append(", name=");
        builder.append(name);
        builder.append(", keyStorePassword=");
        builder.append(keyStorePassword);
        builder.append("]");
        return builder.toString();
    }

    
}
