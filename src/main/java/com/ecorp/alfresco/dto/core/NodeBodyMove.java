package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class NodeBodyMove {
    private String targetParentId;

    private String name;

    public NodeBodyMove() {
    }

    public String getTargetParentId() {
        return targetParentId;
    }

    public void setTargetParentId(String targetParentId) {
        this.targetParentId = targetParentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
