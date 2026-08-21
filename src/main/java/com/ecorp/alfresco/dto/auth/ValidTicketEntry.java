package com.ecorp.alfresco.dto.auth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ValidTicketEntry {
    private ValidTicket entry;

    public ValidTicketEntry() {
    }

    public ValidTicket getEntry() {
        return entry;
    }

    public void setEntry(ValidTicket entry) {
        this.entry = entry;
    }

}
