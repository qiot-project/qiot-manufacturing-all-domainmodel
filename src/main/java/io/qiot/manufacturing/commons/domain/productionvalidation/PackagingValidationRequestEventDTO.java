package io.qiot.manufacturing.commons.domain.productionvalidation;

import io.qiot.manufacturing.commons.domain.production.PackagingMetricsDTO;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class PackagingValidationRequestEventDTO extends AbstractValidationRequestEventDTO {
    public PackagingMetricsDTO data;
}
