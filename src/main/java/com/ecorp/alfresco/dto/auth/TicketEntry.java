package com.ecorp.alfresco.dto.auth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TicketEntry {
    private Ticket entry;

    public TicketEntry() {
    }

    public Ticket getEntry() {
        return entry;
    }

    public void setEntry(Ticket entry) {
        this.entry = entry;
    }

}
