package io.qiot.manufacturing.all.commons.domain.production;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public class ColorMetricsDTO {
    public int red;
    public int green;
    public int blue;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ColorMetricsDTO [red=");
        builder.append(red);
        builder.append(", green=");
        builder.append(green);
        builder.append(", blue=");
        builder.append(blue);
        builder.append("]");
        return builder.toString();
    }

}
