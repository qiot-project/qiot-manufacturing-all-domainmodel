package io.qiot.manufacturing.commons.domain.productionvalidation;

import io.qiot.manufacturing.commons.domain.production.PrintingMetricsDTO;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class PrintingValidationRequestEvent extends AbstractValidationRequestEvent {
    public PrintingMetricsDTO data;
}
