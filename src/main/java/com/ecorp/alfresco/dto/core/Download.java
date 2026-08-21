package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Download {
    private Integer filesAdded;

    private Integer bytesAdded;

    private String id;

    private Integer totalFiles;

    private Integer totalBytes;

    private String status;

    public Download() {
    }

    public Integer getFilesAdded() {
        return filesAdded;
    }

    public void setFilesAdded(Integer filesAdded) {
        this.filesAdded = filesAdded;
    }

    public Integer getBytesAdded() {
        return bytesAdded;
    }

    public void setBytesAdded(Integer bytesAdded) {
        this.bytesAdded = bytesAdded;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTotalFiles() {
        return totalFiles;
    }

    public void setTotalFiles(Integer totalFiles) {
        this.totalFiles = totalFiles;
    }

    public Integer getTotalBytes() {
        return totalBytes;
    }

    public void setTotalBytes(Integer totalBytes) {
        this.totalBytes = totalBytes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
