package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PreferenceEntry {
    private Preference entry;

    public PreferenceEntry() {
    }

    public Preference getEntry() {
        return entry;
    }

    public void setEntry(Preference entry) {
        this.entry = entry;
    }

}
