package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RestoreArchivedContentRequest {
    private String restorePriority;

    public RestoreArchivedContentRequest() {
    }

    public String getRestorePriority() {
        return restorePriority;
    }

    public void setRestorePriority(String restorePriority) {
        this.restorePriority = restorePriority;
    }

}
