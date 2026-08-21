package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonEntry {
    private Person entry;

    public PersonEntry() {
    }

    public Person getEntry() {
        return entry;
    }

    public void setEntry(Person entry) {
        this.entry = entry;
    }

}
