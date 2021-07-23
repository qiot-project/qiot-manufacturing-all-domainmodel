package io.qiot.manufacturing.commons.domain.productionvalidation;

import java.util.UUID;

import io.qiot.manufacturing.commons.domain.production.ProductionChainStageEnum;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public abstract class AbstractProductionChainEvent {
    public UUID productLineId;
    public int itemId;
    public ProductionChainStageEnum stage;
}
