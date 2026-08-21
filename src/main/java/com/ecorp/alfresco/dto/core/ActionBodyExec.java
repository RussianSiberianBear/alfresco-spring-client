package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActionBodyExec {
    private String actionDefinitionId;

    private String targetId;

    private Map<String, Object> params;

    public ActionBodyExec() {
    }

    public String getActionDefinitionId() {
        return actionDefinitionId;
    }

    public void setActionDefinitionId(String actionDefinitionId) {
        this.actionDefinitionId = actionDefinitionId;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

}
