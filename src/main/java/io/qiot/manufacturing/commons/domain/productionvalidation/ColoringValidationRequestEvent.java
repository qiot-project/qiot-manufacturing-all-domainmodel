package io.qiot.manufacturing.commons.domain.productionvalidation;

import io.qiot.manufacturing.commons.domain.production.ColorMetricsDTO;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class ColoringValidationRequestEvent
        extends AbstractValidationRequestEvent {
    public ColorMetricsDTO data;
}
