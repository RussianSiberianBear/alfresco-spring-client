package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Favorite {
    private String targetGuid;

    private OffsetDateTime createdAt;

    private Map<String, Object> target;

    private Map<String, Object> properties;

    private List<String> allowableOperations;

    public Favorite() {
    }

    public String getTargetGuid() {
        return targetGuid;
    }

    public void setTargetGuid(String targetGuid) {
        this.targetGuid = targetGuid;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Map<String, Object> getTarget() {
        return target;
    }

    public void setTarget(Map<String, Object> target) {
        this.target = target;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public List<String> getAllowableOperations() {
        return allowableOperations;
    }

    public void setAllowableOperations(List<String> allowableOperations) {
        this.allowableOperations = allowableOperations;
    }

}
