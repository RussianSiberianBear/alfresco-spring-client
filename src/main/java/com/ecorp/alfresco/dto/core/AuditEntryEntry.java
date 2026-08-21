package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuditEntryEntry {
    private AuditEntry entry;

    public AuditEntryEntry() {
    }

    public AuditEntry getEntry() {
        return entry;
    }

    public void setEntry(AuditEntry entry) {
        this.entry = entry;
    }

}
