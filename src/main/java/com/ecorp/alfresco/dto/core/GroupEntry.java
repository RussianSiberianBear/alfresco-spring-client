package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupEntry {
    private Group entry;

    public GroupEntry() {
    }

    public Group getEntry() {
        return entry;
    }

    public void setEntry(Group entry) {
        this.entry = entry;
    }

}
