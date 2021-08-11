package io.qiot.manufacturing.commons.domain.production;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public enum ProductionChainStageEnum {
    /**
     * 
     */
    WEAVING("weaving"),
    /**
    * 
    */
    COLORING("coloring"),
    /**
    * 
    */
    PRINTING("printing"),
    /**
    * 
    */
    PACKAGING("packaging");

    private final String lcName;

    private ProductionChainStageEnum(String lcName) {
        this.lcName = lcName;
    }

    public String getLCName() {
        return lcName;
    }
}
