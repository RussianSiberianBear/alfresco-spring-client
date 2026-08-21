package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActionConstraintEntry {
    private ActionConstraint entry;

    public ActionConstraintEntry() {
    }

    public ActionConstraint getEntry() {
        return entry;
    }

    public void setEntry(ActionConstraint entry) {
        this.entry = entry;
    }

}
