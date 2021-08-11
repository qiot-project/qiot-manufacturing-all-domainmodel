package io.qiot.manufacturing.commons.domain.production;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class PackagingMetricsDTO {
    public double packaging;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PackagingMetricsDTO [packaging=");
        builder.append(packaging);
        builder.append("]");
        return builder.toString();
    }

}
