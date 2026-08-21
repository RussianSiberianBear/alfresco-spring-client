package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompositeConditionDefinition {
    private Boolean inverted;

    private String booleanMode;

    private List<CompositeConditionDefinition> compositeConditions;

    private List<SimpleConditionDefinition> simpleConditions;

    public CompositeConditionDefinition() {
    }

    public Boolean getInverted() {
        return inverted;
    }

    public void setInverted(Boolean inverted) {
        this.inverted = inverted;
    }

    public String getBooleanMode() {
        return booleanMode;
    }

    public void setBooleanMode(String booleanMode) {
        this.booleanMode = booleanMode;
    }

    public List<CompositeConditionDefinition> getCompositeConditions() {
        return compositeConditions;
    }

    public void setCompositeConditions(List<CompositeConditionDefinition> compositeConditions) {
        this.compositeConditions = compositeConditions;
    }

    public List<SimpleConditionDefinition> getSimpleConditions() {
        return simpleConditions;
    }

    public void setSimpleConditions(List<SimpleConditionDefinition> simpleConditions) {
        this.simpleConditions = simpleConditions;
    }

}
