package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommentEntry {
    private Comment entry;

    public CommentEntry() {
    }

    public Comment getEntry() {
        return entry;
    }

    public void setEntry(Comment entry) {
        this.entry = entry;
    }

}
