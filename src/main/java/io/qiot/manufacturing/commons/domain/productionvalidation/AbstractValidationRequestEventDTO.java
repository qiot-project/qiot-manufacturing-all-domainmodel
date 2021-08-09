package io.qiot.manufacturing.commons.domain.productionvalidation;

import io.quarkus.runtime.annotations.RegisterForReflection;
//
//@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
//@JsonSubTypes({
//        @JsonSubTypes.Type(value = RequestWeavingValidationEvent.class, name = "RequestWeavingValidationEvent"),
//        @JsonSubTypes.Type(value = RequestColoringValidationEvent.class, name = "RequestColoringValidationEvent"),
//        @JsonSubTypes.Type(value = RequestPrintingValidationEvent.class, name = "RequestPrintingValidationEvent"),
//        @JsonSubTypes.Type(value = RequestPackagingValidationEvent.class, name = "RequestPackagingValidationEvent") })
@RegisterForReflection
public class AbstractValidationRequestEventDTO
        extends AbstractProductionChainEventDTO {
    public String machineryId;

}
