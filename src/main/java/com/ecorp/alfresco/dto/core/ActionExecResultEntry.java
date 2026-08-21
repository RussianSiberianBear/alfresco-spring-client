package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActionExecResultEntry {
    private ActionExecResult entry;

    public ActionExecResultEntry() {
    }

    public ActionExecResult getEntry() {
        return entry;
    }

    public void setEntry(ActionExecResult entry) {
        this.entry = entry;
    }

}
