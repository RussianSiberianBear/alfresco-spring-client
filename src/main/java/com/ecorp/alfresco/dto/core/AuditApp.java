package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuditApp {
    private String id;

    private String name;

    private Boolean isEnabled;

    private Integer maxEntryId;

    private Integer minEntryId;

    public AuditApp() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Integer getMaxEntryId() {
        return maxEntryId;
    }

    public void setMaxEntryId(Integer maxEntryId) {
        this.maxEntryId = maxEntryId;
    }

    public Integer getMinEntryId() {
        return minEntryId;
    }

    public void setMinEntryId(Integer minEntryId) {
        this.minEntryId = minEntryId;
    }

}
