package io.qiot.manufacturing.commons.domain.production;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class SizeMetricsDTO {
    public double chest;
    public double shoulder;
    public double back;
    public double waist;
    public double hip;
}
