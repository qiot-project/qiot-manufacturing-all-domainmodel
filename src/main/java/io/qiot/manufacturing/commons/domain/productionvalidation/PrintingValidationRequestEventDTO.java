package io.qiot.manufacturing.commons.domain.productionvalidation;

import io.qiot.manufacturing.commons.domain.production.PrintingMetricsDTO;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class PrintingValidationRequestEventDTO extends AbstractValidationRequestEventDTO {
    public PrintingMetricsDTO data;
}
