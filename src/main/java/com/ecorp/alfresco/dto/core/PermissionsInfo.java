package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PermissionsInfo {
    private Boolean isInheritanceEnabled;

    private List<PermissionElement> inherited;

    private List<PermissionElement> locallySet;

    private List<String> settable;

    public PermissionsInfo() {
    }

    public Boolean getIsInheritanceEnabled() {
        return isInheritanceEnabled;
    }

    public void setIsInheritanceEnabled(Boolean isInheritanceEnabled) {
        this.isInheritanceEnabled = isInheritanceEnabled;
    }

    public List<PermissionElement> getInherited() {
        return inherited;
    }

    public void setInherited(List<PermissionElement> inherited) {
        this.inherited = inherited;
    }

    public List<PermissionElement> getLocallySet() {
        return locallySet;
    }

    public void setLocallySet(List<PermissionElement> locallySet) {
        this.locallySet = locallySet;
    }

    public List<String> getSettable() {
        return settable;
    }

    public void setSettable(List<String> settable) {
        this.settable = settable;
    }

}
