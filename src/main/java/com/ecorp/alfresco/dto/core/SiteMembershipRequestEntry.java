package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteMembershipRequestEntry {
    private SiteMembershipRequest entry;

    public SiteMembershipRequestEntry() {
    }

    public SiteMembershipRequest getEntry() {
        return entry;
    }

    public void setEntry(SiteMembershipRequest entry) {
        this.entry = entry;
    }

}
