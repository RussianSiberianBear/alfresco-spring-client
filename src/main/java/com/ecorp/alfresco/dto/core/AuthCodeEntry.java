package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthCodeEntry {
    private AuthCode entry;

    public AuthCodeEntry() {
    }

    public AuthCode getEntry() {
        return entry;
    }

    public void setEntry(AuthCode entry) {
        this.entry = entry;
    }

}
