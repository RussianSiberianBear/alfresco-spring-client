package com.ecorp.alfresco.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestDefaults {
    private List<String> textAttributes;

    private String defaultFTSOperator;

    private String defaultFTSFieldOperator;

    private String namespace;

    private String defaultFieldName;

    public RequestDefaults() {
    }

    public List<String> getTextAttributes() {
        return textAttributes;
    }

    public void setTextAttributes(List<String> textAttributes) {
        this.textAttributes = textAttributes;
    }

    public String getDefaultFTSOperator() {
        return defaultFTSOperator;
    }

    public void setDefaultFTSOperator(String defaultFTSOperator) {
        this.defaultFTSOperator = defaultFTSOperator;
    }

    public String getDefaultFTSFieldOperator() {
        return defaultFTSFieldOperator;
    }

    public void setDefaultFTSFieldOperator(String defaultFTSFieldOperator) {
        this.defaultFTSFieldOperator = defaultFTSFieldOperator;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getDefaultFieldName() {
        return defaultFieldName;
    }

    public void setDefaultFieldName(String defaultFieldName) {
        this.defaultFieldName = defaultFieldName;
    }

}
