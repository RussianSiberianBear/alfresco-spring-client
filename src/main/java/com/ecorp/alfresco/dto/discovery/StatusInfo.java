package com.ecorp.alfresco.dto.discovery;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StatusInfo {
    private Boolean isReadOnly;

    private Boolean isAuditEnabled;

    private Boolean isQuickShareEnabled;

    private Boolean isThumbnailGenerationEnabled;

    private Boolean isDirectAccessUrlEnabled;

    public StatusInfo() {
    }

    public Boolean getIsReadOnly() {
        return isReadOnly;
    }

    public void setIsReadOnly(Boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }

    public Boolean getIsAuditEnabled() {
        return isAuditEnabled;
    }

    public void setIsAuditEnabled(Boolean isAuditEnabled) {
        this.isAuditEnabled = isAuditEnabled;
    }

    public Boolean getIsQuickShareEnabled() {
        return isQuickShareEnabled;
    }

    public void setIsQuickShareEnabled(Boolean isQuickShareEnabled) {
        this.isQuickShareEnabled = isQuickShareEnabled;
    }

    public Boolean getIsThumbnailGenerationEnabled() {
        return isThumbnailGenerationEnabled;
    }

    public void setIsThumbnailGenerationEnabled(Boolean isThumbnailGenerationEnabled) {
        this.isThumbnailGenerationEnabled = isThumbnailGenerationEnabled;
    }

    public Boolean getIsDirectAccessUrlEnabled() {
        return isDirectAccessUrlEnabled;
    }

    public void setIsDirectAccessUrlEnabled(Boolean isDirectAccessUrlEnabled) {
        this.isDirectAccessUrlEnabled = isDirectAccessUrlEnabled;
    }

}
