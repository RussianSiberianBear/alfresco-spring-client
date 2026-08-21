package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CascadingDictEntry {
    private CascadingDict entry;

    public CascadingDictEntry() {
    }

    public CascadingDict getEntry() {
        return entry;
    }

    public void setEntry(CascadingDict entry) {
        this.entry = entry;
    }

}
