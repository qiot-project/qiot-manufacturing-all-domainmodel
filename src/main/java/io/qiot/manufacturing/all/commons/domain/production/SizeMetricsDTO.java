package io.qiot.manufacturing.all.commons.domain.production;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public class SizeMetricsDTO {
    public double chest;
    public double shoulder;
    public double back;
    public double waist;
    public double hip;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("SizeMetricsDTO [chest=");
        builder.append(chest);
        builder.append(", shoulder=");
        builder.append(shoulder);
        builder.append(", back=");
        builder.append(back);
        builder.append(", waist=");
        builder.append(waist);
        builder.append(", hip=");
        builder.append(hip);
        builder.append("]");
        return builder.toString();
    }
}
