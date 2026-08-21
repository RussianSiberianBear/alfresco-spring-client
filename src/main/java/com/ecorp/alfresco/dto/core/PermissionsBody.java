package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PermissionsBody {
    private Boolean isInheritanceEnabled;

    private List<PermissionElement> locallySet;

    public PermissionsBody() {
    }

    public Boolean getIsInheritanceEnabled() {
        return isInheritanceEnabled;
    }

    public void setIsInheritanceEnabled(Boolean isInheritanceEnabled) {
        this.isInheritanceEnabled = isInheritanceEnabled;
    }

    public List<PermissionElement> getLocallySet() {
        return locallySet;
    }

    public void setLocallySet(List<PermissionElement> locallySet) {
        this.locallySet = locallySet;
    }

}
