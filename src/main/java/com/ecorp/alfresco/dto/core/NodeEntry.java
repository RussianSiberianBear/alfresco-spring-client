package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class NodeEntry {
    private Node entry;

    public NodeEntry() {
    }

    public Node getEntry() {
        return entry;
    }

    public void setEntry(Node entry) {
        this.entry = entry;
    }

}
