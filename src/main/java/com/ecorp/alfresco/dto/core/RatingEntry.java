package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RatingEntry {
    private Rating entry;

    public RatingEntry() {
    }

    public Rating getEntry() {
        return entry;
    }

    public void setEntry(Rating entry) {
        this.entry = entry;
    }

}
