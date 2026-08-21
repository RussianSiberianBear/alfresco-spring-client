package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.OffsetDateTime;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuditEntry {
    private String id;

    private String auditApplicationId;

    private UserInfo createdByUser;

    private OffsetDateTime createdAt;

    private Map<String, Object> values;

    public AuditEntry() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuditApplicationId() {
        return auditApplicationId;
    }

    public void setAuditApplicationId(String auditApplicationId) {
        this.auditApplicationId = auditApplicationId;
    }

    public UserInfo getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(UserInfo createdByUser) {
        this.createdByUser = createdByUser;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Map<String, Object> getValues() {
        return values;
    }

    public void setValues(Map<String, Object> values) {
        this.values = values;
    }

}
