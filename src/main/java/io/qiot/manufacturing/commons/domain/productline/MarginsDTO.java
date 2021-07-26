package io.qiot.manufacturing.commons.domain.productline;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class MarginsDTO {
    public double weaving;
    public int coloring;
    public double printing;
    public double packaging;
}
