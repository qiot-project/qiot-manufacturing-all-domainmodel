/**
 * 
 */
package io.qiot.manufacturing.commons.domain.production;

import java.util.UUID;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public class ItemDTO {
    public int id;
    public ProductionChainStageEnum stage;
    public UUID productLineId;
    public SizeMetricsDTO sizeMetrics;
    public ColorMetricsDTO colorMetrics;
    public PrintingMetricsDTO printingMetrics;
    public PackagingMetricsDTO packagingMetrics;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ItemDTO [id=");
        builder.append(id);
        builder.append(", stage=");
        builder.append(stage);
        builder.append(", productLineId=");
        builder.append(productLineId);
        builder.append(", sizeMetrics=");
        builder.append(sizeMetrics);
        builder.append(", colorMetrics=");
        builder.append(colorMetrics);
        builder.append(", printingMetrics=");
        builder.append(printingMetrics);
        builder.append(", packagingMetrics=");
        builder.append(packagingMetrics);
        builder.append("]");
        return builder.toString();
    }

}
