package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActionDefinitionEntry {
    private ActionDefinition entry;

    public ActionDefinitionEntry() {
    }

    public ActionDefinition getEntry() {
        return entry;
    }

    public void setEntry(ActionDefinition entry) {
        this.entry = entry;
    }

}
