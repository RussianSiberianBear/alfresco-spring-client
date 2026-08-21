package com.ecorp.alfresco.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultSetRowEntry {
    private ResultNode entry;

    public ResultSetRowEntry() {
    }

    public ResultNode getEntry() {
        return entry;
    }

    public void setEntry(ResultNode entry) {
        this.entry = entry;
    }

}
