package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FavoriteEntry {
    private Favorite entry;

    public FavoriteEntry() {
    }

    public Favorite getEntry() {
        return entry;
    }

    public void setEntry(Favorite entry) {
        this.entry = entry;
    }

}
