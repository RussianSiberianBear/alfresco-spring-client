package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryEntry {
    private Category entry;

    public CategoryEntry() {
    }

    public Category getEntry() {
        return entry;
    }

    public void setEntry(Category entry) {
        this.entry = entry;
    }

}
