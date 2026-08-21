package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VersionEntry {
    private Version entry;

    public VersionEntry() {
    }

    public Version getEntry() {
        return entry;
    }

    public void setEntry(Version entry) {
        this.entry = entry;
    }

}
