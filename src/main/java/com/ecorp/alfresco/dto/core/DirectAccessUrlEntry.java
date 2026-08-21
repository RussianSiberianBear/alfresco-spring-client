package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DirectAccessUrlEntry {
    private DirectAccessUrl entry;

    public DirectAccessUrlEntry() {
    }

    public DirectAccessUrl getEntry() {
        return entry;
    }

    public void setEntry(DirectAccessUrl entry) {
        this.entry = entry;
    }

}
