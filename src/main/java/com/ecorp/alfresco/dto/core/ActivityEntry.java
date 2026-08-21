package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActivityEntry {
    private Activity entry;

    public ActivityEntry() {
    }

    public Activity getEntry() {
        return entry;
    }

    public void setEntry(Activity entry) {
        this.entry = entry;
    }

}
