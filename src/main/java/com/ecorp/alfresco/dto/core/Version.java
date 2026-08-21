package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Version {
    private String id;

    private String versionComment;

    private String name;

    private String nodeType;

    private Boolean isFolder;

    private Boolean isFile;

    private OffsetDateTime modifiedAt;

    private UserInfo modifiedByUser;

    private ContentInfo content;

    private List<String> aspectNames;

    private Map<String, Object> properties;

    public Version() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVersionComment() {
        return versionComment;
    }

    public void setVersionComment(String versionComment) {
        this.versionComment = versionComment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public Boolean getIsFolder() {
        return isFolder;
    }

    public void setIsFolder(Boolean isFolder) {
        this.isFolder = isFolder;
    }

    public Boolean getIsFile() {
        return isFile;
    }

    public void setIsFile(Boolean isFile) {
        this.isFile = isFile;
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

    public ContentInfo getContent() {
        return content;
    }

    public void setContent(ContentInfo content) {
        this.content = content;
    }

    public List<String> getAspectNames() {
        return aspectNames;
    }

    public void setAspectNames(List<String> aspectNames) {
        this.aspectNames = aspectNames;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

}
