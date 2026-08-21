package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Property {
    private String id;

    private String title;

    private String description;

    private String defaultValue;

    private String dataType;

    private Boolean isMultiValued;

    private Boolean isMandatory;

    private Boolean isMandatoryEnforced;

    private Boolean isProtected;

    private List<Constraint> constraints;

    public Property() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Boolean getIsMultiValued() {
        return isMultiValued;
    }

    public void setIsMultiValued(Boolean isMultiValued) {
        this.isMultiValued = isMultiValued;
    }

    public Boolean getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(Boolean isMandatory) {
        this.isMandatory = isMandatory;
    }

    public Boolean getIsMandatoryEnforced() {
        return isMandatoryEnforced;
    }

    public void setIsMandatoryEnforced(Boolean isMandatoryEnforced) {
        this.isMandatoryEnforced = isMandatoryEnforced;
    }

    public Boolean getIsProtected() {
        return isProtected;
    }

    public void setIsProtected(Boolean isProtected) {
        this.isProtected = isProtected;
    }

    public List<Constraint> getConstraints() {
        return constraints;
    }

    public void setConstraints(List<Constraint> constraints) {
        this.constraints = constraints;
    }

}
