package com.ecorp.alfresco.dto.discovery;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntitlementsInfo {
    private Long maxUsers;

    private Long maxDocs;

    private Boolean isClusterEnabled;

    private Boolean isCryptodocEnabled;

    private Boolean isCustomEmbeddedWorkflowEnabled;

    public EntitlementsInfo() {
    }

    public Long getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(Long maxUsers) {
        this.maxUsers = maxUsers;
    }

    public Long getMaxDocs() {
        return maxDocs;
    }

    public void setMaxDocs(Long maxDocs) {
        this.maxDocs = maxDocs;
    }

    public Boolean getIsClusterEnabled() {
        return isClusterEnabled;
    }

    public void setIsClusterEnabled(Boolean isClusterEnabled) {
        this.isClusterEnabled = isClusterEnabled;
    }

    public Boolean getIsCryptodocEnabled() {
        return isCryptodocEnabled;
    }

    public void setIsCryptodocEnabled(Boolean isCryptodocEnabled) {
        this.isCryptodocEnabled = isCryptodocEnabled;
    }

    public Boolean getIsCustomEmbeddedWorkflowEnabled() {
        return isCustomEmbeddedWorkflowEnabled;
    }

    public void setIsCustomEmbeddedWorkflowEnabled(Boolean isCustomEmbeddedWorkflowEnabled) {
        this.isCustomEmbeddedWorkflowEnabled = isCustomEmbeddedWorkflowEnabled;
    }

}
