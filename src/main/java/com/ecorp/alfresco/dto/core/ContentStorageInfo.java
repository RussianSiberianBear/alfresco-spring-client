package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentStorageInfo {
    private String id;

    private Map<String, String> storageProperties;

    public ContentStorageInfo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, String> getStorageProperties() {
        return storageProperties;
    }

    public void setStorageProperties(Map<String, String> storageProperties) {
        this.storageProperties = storageProperties;
    }

}
