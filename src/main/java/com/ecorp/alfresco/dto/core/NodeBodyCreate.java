package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class NodeBodyCreate {
    private String name;

    private String nodeType;

    private List<String> aspectNames;

    private Map<String, Object> properties;

    private PermissionsBody permissions;

    private Definition definition;

    private String relativePath;

    private Object association;

    private List<ChildAssociationBody> secondaryChildren;

    private List<AssociationBody> targets;

    public NodeBodyCreate() {
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

    public PermissionsBody getPermissions() {
        return permissions;
    }

    public void setPermissions(PermissionsBody permissions) {
        this.permissions = permissions;
    }

    public Definition getDefinition() {
        return definition;
    }

    public void setDefinition(Definition definition) {
        this.definition = definition;
    }

    public String getRelativePath() {
        return relativePath;
    }

    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    public Object getAssociation() {
        return association;
    }

    public void setAssociation(Object association) {
        this.association = association;
    }

    public List<ChildAssociationBody> getSecondaryChildren() {
        return secondaryChildren;
    }

    public void setSecondaryChildren(List<ChildAssociationBody> secondaryChildren) {
        this.secondaryChildren = secondaryChildren;
    }

    public List<AssociationBody> getTargets() {
        return targets;
    }

    public void setTargets(List<AssociationBody> targets) {
        this.targets = targets;
    }

}
