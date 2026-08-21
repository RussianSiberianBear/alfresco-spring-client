package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class sizeDetailsRequestResultEntry {
    private sizeDetailsRequestExecResult entry;

    public sizeDetailsRequestResultEntry() {
    }

    public sizeDetailsRequestExecResult getEntry() {
        return entry;
    }

    public void setEntry(sizeDetailsRequestExecResult entry) {
        this.entry = entry;
    }

}
