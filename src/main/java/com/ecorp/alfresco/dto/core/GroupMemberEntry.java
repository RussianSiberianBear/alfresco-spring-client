package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupMemberEntry {
    private GroupMember entry;

    public GroupMemberEntry() {
    }

    public GroupMember getEntry() {
        return entry;
    }

    public void setEntry(GroupMember entry) {
        this.entry = entry;
    }

}
