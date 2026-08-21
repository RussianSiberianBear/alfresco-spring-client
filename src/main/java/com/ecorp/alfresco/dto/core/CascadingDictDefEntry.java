package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CascadingDictDefEntry {
    private CascadingDictDef entry;

    public CascadingDictDefEntry() {
    }

    public CascadingDictDef getEntry() {
        return entry;
    }

    public void setEntry(CascadingDictDef entry) {
        this.entry = entry;
    }

}
