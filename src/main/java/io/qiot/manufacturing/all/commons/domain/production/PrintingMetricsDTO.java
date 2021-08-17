package io.qiot.manufacturing.all.commons.domain.production;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public class PrintingMetricsDTO {
    public double printing;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PrintingMetricsDTO [printing=");
        builder.append(printing);
        builder.append("]");
        return builder.toString();
    }

}
