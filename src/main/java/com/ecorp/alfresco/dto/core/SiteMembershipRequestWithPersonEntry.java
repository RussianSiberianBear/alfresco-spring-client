package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteMembershipRequestWithPersonEntry {
    private SiteMembershipRequestWithPerson entry;

    public SiteMembershipRequestWithPersonEntry() {
    }

    public SiteMembershipRequestWithPerson getEntry() {
        return entry;
    }

    public void setEntry(SiteMembershipRequestWithPerson entry) {
        this.entry = entry;
    }

}
