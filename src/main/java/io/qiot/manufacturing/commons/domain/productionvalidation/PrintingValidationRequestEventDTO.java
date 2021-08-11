package io.qiot.manufacturing.commons.domain.productionvalidation;

import io.qiot.manufacturing.commons.domain.production.PrintingMetricsDTO;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class PrintingValidationRequestEventDTO
        extends AbstractValidationRequestEventDTO {
    public PrintingMetricsDTO data;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PrintingValidationRequestEventDTO [machineryId=");
        builder.append(machineryId);
        builder.append(", productLineId=");
        builder.append(productLineId);
        builder.append(", itemId=");
        builder.append(itemId);
        builder.append(", stage=");
        builder.append(stage);
        builder.append(", data=");
        builder.append(data);
        builder.append("]");
        return builder.toString();
    }
}
