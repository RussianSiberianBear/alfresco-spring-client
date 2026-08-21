package com.ecorp.alfresco.dto.discovery;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DiscoveryEntry {
    private RepositoryEntry entry;

    public DiscoveryEntry() {
    }

    public RepositoryEntry getEntry() {
        return entry;
    }

    public void setEntry(RepositoryEntry entry) {
        this.entry = entry;
    }

}
