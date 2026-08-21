package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeletedNodeBodyRestore {
    private String targetParentId;

    private String assocType;

    public DeletedNodeBodyRestore() {
    }

    public String getTargetParentId() {
        return targetParentId;
    }

    public void setTargetParentId(String targetParentId) {
        this.targetParentId = targetParentId;
    }

    public String getAssocType() {
        return assocType;
    }

    public void setAssocType(String assocType) {
        this.assocType = assocType;
    }

}
