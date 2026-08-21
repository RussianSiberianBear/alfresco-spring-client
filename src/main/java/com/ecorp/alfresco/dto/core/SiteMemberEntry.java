package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteMemberEntry {
    private SiteMember entry;

    public SiteMemberEntry() {
    }

    public SiteMember getEntry() {
        return entry;
    }

    public void setEntry(SiteMember entry) {
        this.entry = entry;
    }

}
