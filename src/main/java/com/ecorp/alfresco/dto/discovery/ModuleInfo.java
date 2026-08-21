package com.ecorp.alfresco.dto.discovery;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.OffsetDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ModuleInfo {
    private String id;

    private String title;

    private String description;

    private String version;

    private OffsetDateTime installDate;

    private String installState;

    private String versionMin;

    private String versionMax;

    public ModuleInfo() {
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public OffsetDateTime getInstallDate() {
        return installDate;
    }

    public void setInstallDate(OffsetDateTime installDate) {
        this.installDate = installDate;
    }

    public String getInstallState() {
        return installState;
    }

    public void setInstallState(String installState) {
        this.installState = installState;
    }

    public String getVersionMin() {
        return versionMin;
    }

    public void setVersionMin(String versionMin) {
        this.versionMin = versionMin;
    }

    public String getVersionMax() {
        return versionMax;
    }

    public void setVersionMax(String versionMax) {
        this.versionMax = versionMax;
    }

}
