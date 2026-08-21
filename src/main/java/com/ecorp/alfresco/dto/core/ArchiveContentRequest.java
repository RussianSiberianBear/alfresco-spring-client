package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArchiveContentRequest {
    private Map<String, String> archiveParams;

    public ArchiveContentRequest() {
    }

    public Map<String, String> getArchiveParams() {
        return archiveParams;
    }

    public void setArchiveParams(Map<String, String> archiveParams) {
        this.archiveParams = archiveParams;
    }

}
