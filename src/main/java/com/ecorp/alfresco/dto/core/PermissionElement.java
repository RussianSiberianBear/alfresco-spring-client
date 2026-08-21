package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PermissionElement {
    private String authorityId;

    private String name;

    private String accessStatus;

    private String authorityDisplayName;

    public PermissionElement() {
    }

    public String getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(String authorityId) {
        this.authorityId = authorityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(String accessStatus) {
        this.accessStatus = accessStatus;
    }

    public String getAuthorityDisplayName() {
        return authorityDisplayName;
    }

    public void setAuthorityDisplayName(String authorityDisplayName) {
        this.authorityDisplayName = authorityDisplayName;
    }

}
