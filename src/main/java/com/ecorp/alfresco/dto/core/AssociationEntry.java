package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AssociationEntry {
    private Association entry;

    public AssociationEntry() {
    }

    public Association getEntry() {
        return entry;
    }

    public void setEntry(Association entry) {
        this.entry = entry;
    }

}
