package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuditAppEntry {
    private AuditApp entry;

    public AuditAppEntry() {
    }

    public AuditApp getEntry() {
        return entry;
    }

    public void setEntry(AuditApp entry) {
        this.entry = entry;
    }

}
