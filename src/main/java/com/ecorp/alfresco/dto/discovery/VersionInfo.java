package com.ecorp.alfresco.dto.discovery;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VersionInfo {
    private String major;

    private String minor;

    private String patch;

    private String hotfix;

    private Integer schema;

    private String label;

    private String display;

    public VersionInfo() {
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public String getPatch() {
        return patch;
    }

    public void setPatch(String patch) {
        this.patch = patch;
    }

    public String getHotfix() {
        return hotfix;
    }

    public void setHotfix(String hotfix) {
        this.hotfix = hotfix;
    }

    public Integer getSchema() {
        return schema;
    }

    public void setSchema(Integer schema) {
        this.schema = schema;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

}
