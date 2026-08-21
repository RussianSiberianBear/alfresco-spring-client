package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RevertBody {
    private Boolean majorVersion;

    private String comment;

    public RevertBody() {
    }

    public Boolean getMajorVersion() {
        return majorVersion;
    }

    public void setMajorVersion(Boolean majorVersion) {
        this.majorVersion = majorVersion;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
