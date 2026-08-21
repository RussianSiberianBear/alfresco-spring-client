package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class NodeAssociationEntry {
    private NodeAssociation entry;

    public NodeAssociationEntry() {
    }

    public NodeAssociation getEntry() {
        return entry;
    }

    public void setEntry(NodeAssociation entry) {
        this.entry = entry;
    }

}
