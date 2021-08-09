package io.qiot.manufacturing.commons.domain.productionvalidation;

import io.qiot.manufacturing.commons.domain.production.ColorMetricsDTO;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class ColoringValidationRequestEventDTO
        extends AbstractValidationRequestEventDTO {
    public ColorMetricsDTO data;
}
