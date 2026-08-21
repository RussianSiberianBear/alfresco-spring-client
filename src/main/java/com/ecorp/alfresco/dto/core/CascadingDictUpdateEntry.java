package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CascadingDictUpdateEntry {
    private CascadingDictUpdate entry;

    public CascadingDictUpdateEntry() {
    }

    public CascadingDictUpdate getEntry() {
        return entry;
    }

    public void setEntry(CascadingDictUpdate entry) {
        this.entry = entry;
    }

}
