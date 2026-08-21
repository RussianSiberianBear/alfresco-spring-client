package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TagEntry {
    private Tag entry;

    public TagEntry() {
    }

    public Tag getEntry() {
        return entry;
    }

    public void setEntry(Tag entry) {
        this.entry = entry;
    }

}
