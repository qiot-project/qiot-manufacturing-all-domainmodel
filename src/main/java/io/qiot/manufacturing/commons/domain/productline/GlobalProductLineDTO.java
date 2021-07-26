package io.qiot.manufacturing.commons.domain.productline;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class GlobalProductLineDTO {
    public UUID id;
    public Instant createdOn;
    public SizeChartRangesDTO sizeChart;
    public ColorRangesDTO color;
    public PrintingRangesDTO print;
    public PackagingRangesDTO packaging;
    public MarginsDTO margins;
    

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GlobalProductLineDTO other = (GlobalProductLineDTO) obj;
        return Objects.equals(id, other.id);
    }

    
}