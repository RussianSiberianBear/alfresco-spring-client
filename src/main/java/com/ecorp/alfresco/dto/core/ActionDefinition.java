package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActionDefinition {
    private String id;

    private String name;

    private String title;

    private String description;

    private List<String> applicableTypes;

    private Boolean trackStatus;

    private List<ActionParameterDefinition> parameterDefinitions;

    public ActionDefinition() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public List<String> getApplicableTypes() {
        return applicableTypes;
    }

    public void setApplicableTypes(List<String> applicableTypes) {
        this.applicableTypes = applicableTypes;
    }

    public Boolean getTrackStatus() {
        return trackStatus;
    }

    public void setTrackStatus(Boolean trackStatus) {
        this.trackStatus = trackStatus;
    }

    public List<ActionParameterDefinition> getParameterDefinitions() {
        return parameterDefinitions;
    }

    public void setParameterDefinitions(List<ActionParameterDefinition> parameterDefinitions) {
        this.parameterDefinitions = parameterDefinitions;
    }

}
