package com.ecorp.alfresco.dto.discovery;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RepositoryEntry {
    private RepositoryInfo repository;

    public RepositoryEntry() {
    }

    public RepositoryInfo getRepository() {
        return repository;
    }

    public void setRepository(RepositoryInfo repository) {
        this.repository = repository;
    }

}
