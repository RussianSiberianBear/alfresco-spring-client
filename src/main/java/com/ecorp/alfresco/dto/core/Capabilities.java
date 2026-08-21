package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Capabilities {
    private Boolean isAdmin;

    private Boolean isGuest;

    private Boolean isMutable;

    public Capabilities() {
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Boolean getIsGuest() {
        return isGuest;
    }

    public void setIsGuest(Boolean isGuest) {
        this.isGuest = isGuest;
    }

    public Boolean getIsMutable() {
        return isMutable;
    }

    public void setIsMutable(Boolean isMutable) {
        this.isMutable = isMutable;
    }

}
