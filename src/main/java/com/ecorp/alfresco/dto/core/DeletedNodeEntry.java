package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeletedNodeEntry {
    private DeletedNode entry;

    public DeletedNodeEntry() {
    }

    public DeletedNode getEntry() {
        return entry;
    }

    public void setEntry(DeletedNode entry) {
        this.entry = entry;
    }

}
