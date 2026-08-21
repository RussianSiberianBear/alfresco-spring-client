package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonNetworkEntry {
    private PersonNetwork entry;

    public PersonNetworkEntry() {
    }

    public PersonNetwork getEntry() {
        return entry;
    }

    public void setEntry(PersonNetwork entry) {
        this.entry = entry;
    }

}
