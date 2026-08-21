package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CascadingDictItem {
    private Map<String, Object> properties;

    private List<CascadingDictItem> children;

    public CascadingDictItem() {
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public List<CascadingDictItem> getChildren() {
        return children;
    }

    public void setChildren(List<CascadingDictItem> children) {
        this.children = children;
    }

}
