package io.qiot.manufacturing.commons.domain.productionvalidation;

import io.qiot.manufacturing.commons.domain.production.SizeMetricsDTO;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class WeavingValidationRequestEvent
        extends AbstractValidationRequestEvent {
    public SizeMetricsDTO data;
}
