package io.qiot.manufacturing.all.commons.domain.landscape;

import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public class MachineryDTO extends AbstractLandscapeDTO {
    @JsonProperty(value = "factory_id")
    public UUID factoryId;

    @Override
    public int hashCode() {
        return Objects.hash(factoryId, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MachineryDTO other = (MachineryDTO) obj;
        return Objects.equals(factoryId, other.factoryId)
                && Objects.equals(id, other.id);
    }

}