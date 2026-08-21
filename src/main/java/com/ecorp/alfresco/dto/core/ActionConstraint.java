package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActionConstraint {
    private String constraintName;

    private List<ActionConstraintData> constraintValues;

    public ActionConstraint() {
    }

    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }

    public List<ActionConstraintData> getConstraintValues() {
        return constraintValues;
    }

    public void setConstraintValues(List<ActionConstraintData> constraintValues) {
        this.constraintValues = constraintValues;
    }

}
