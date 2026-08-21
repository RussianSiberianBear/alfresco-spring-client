package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteGroupEntry {
    private SiteGroup entry;

    public SiteGroupEntry() {
    }

    public SiteGroup getEntry() {
        return entry;
    }

    public void setEntry(SiteGroup entry) {
        this.entry = entry;
    }

}
