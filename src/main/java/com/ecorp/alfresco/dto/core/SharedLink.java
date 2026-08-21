package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SharedLink {
    private String id;

    private OffsetDateTime expiresAt;

    private String nodeId;

    private String name;

    private String title;

    private String description;

    private OffsetDateTime modifiedAt;

    private UserInfo modifiedByUser;

    private UserInfo sharedByUser;

    private ContentInfo content;

    private List<String> allowableOperations;

    private List<String> allowableOperationsOnTarget;

    private Boolean isFavorite;

    private Map<String, Object> properties;

    private List<String> aspectNames;

    private PathInfo path;

    public SharedLink() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OffsetDateTime getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OffsetDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(OffsetDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public UserInfo getModifiedByUser() {
        return modifiedByUser;
    }

    public void setModifiedByUser(UserInfo modifiedByUser) {
        this.modifiedByUser = modifiedByUser;
    }

    public UserInfo getSharedByUser() {
        return sharedByUser;
    }

    public void setSharedByUser(UserInfo sharedByUser) {
        this.sharedByUser = sharedByUser;
    }

    public ContentInfo getContent() {
        return content;
    }

    public void setContent(ContentInfo content) {
        this.content = content;
    }

    public List<String> getAllowableOperations() {
        return allowableOperations;
    }

    public void setAllowableOperations(List<String> allowableOperations) {
        this.allowableOperations = allowableOperations;
    }

    public List<String> getAllowableOperationsOnTarget() {
        return allowableOperationsOnTarget;
    }

    public void setAllowableOperationsOnTarget(List<String> allowableOperationsOnTarget) {
        this.allowableOperationsOnTarget = allowableOperationsOnTarget;
    }

    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public List<String> getAspectNames() {
        return aspectNames;
    }

    public void setAspectNames(List<String> aspectNames) {
        this.aspectNames = aspectNames;
    }

    public PathInfo getPath() {
        return path;
    }

    public void setPath(PathInfo path) {
        this.path = path;
    }

}
