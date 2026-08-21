package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DownloadEntry {
    private Download entry;

    public DownloadEntry() {
    }

    public Download getEntry() {
        return entry;
    }

    public void setEntry(Download entry) {
        this.entry = entry;
    }

}
