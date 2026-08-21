package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteEntry {
    private Site entry;

    public SiteEntry() {
    }

    public Site getEntry() {
        return entry;
    }

    public void setEntry(Site entry) {
        this.entry = entry;
    }

}
