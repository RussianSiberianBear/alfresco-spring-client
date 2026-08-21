package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CascadingDictCreateEntry {
    private CascadingDictCreate entry;

    public CascadingDictCreateEntry() {
    }

    public CascadingDictCreate getEntry() {
        return entry;
    }

    public void setEntry(CascadingDictCreate entry) {
        this.entry = entry;
    }

}
