package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class NodeChildAssociationEntry {
    private NodeChildAssociation entry;

    public NodeChildAssociationEntry() {
    }

    public NodeChildAssociation getEntry() {
        return entry;
    }

    public void setEntry(NodeChildAssociation entry) {
        this.entry = entry;
    }

}
