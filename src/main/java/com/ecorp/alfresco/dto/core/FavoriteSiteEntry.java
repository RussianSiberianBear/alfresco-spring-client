package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FavoriteSiteEntry {
    private FavoriteSite entry;

    public FavoriteSiteEntry() {
    }

    public FavoriteSite getEntry() {
        return entry;
    }

    public void setEntry(FavoriteSite entry) {
        this.entry = entry;
    }

}
