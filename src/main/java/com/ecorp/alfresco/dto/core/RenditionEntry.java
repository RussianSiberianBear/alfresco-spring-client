package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RenditionEntry {
    private Rendition entry;

    public RenditionEntry() {
    }

    public Rendition getEntry() {
        return entry;
    }

    public void setEntry(Rendition entry) {
        this.entry = entry;
    }

}
