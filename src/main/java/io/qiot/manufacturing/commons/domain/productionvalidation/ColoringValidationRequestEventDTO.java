package io.qiot.manufacturing.commons.domain.productionvalidation;

import io.qiot.manufacturing.commons.domain.production.ColorMetricsDTO;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class ColoringValidationRequestEventDTO
        extends AbstractValidationRequestEventDTO {
    public ColorMetricsDTO data;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ColoringValidationRequestEventDTO [machineryId=");
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
