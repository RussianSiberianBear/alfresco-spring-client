package com.ecorp.alfresco.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestLimits {
    private Integer permissionEvaluationTime;

    private Integer permissionEvaluationCount;

    private Integer trackTotalHitsLimit;

    public RequestLimits() {
    }

    public Integer getPermissionEvaluationTime() {
        return permissionEvaluationTime;
    }

    public void setPermissionEvaluationTime(Integer permissionEvaluationTime) {
        this.permissionEvaluationTime = permissionEvaluationTime;
    }

    public Integer getPermissionEvaluationCount() {
        return permissionEvaluationCount;
    }

    public void setPermissionEvaluationCount(Integer permissionEvaluationCount) {
        this.permissionEvaluationCount = permissionEvaluationCount;
    }

    public Integer getTrackTotalHitsLimit() {
        return trackTotalHitsLimit;
    }

    public void setTrackTotalHitsLimit(Integer trackTotalHitsLimit) {
        this.trackTotalHitsLimit = trackTotalHitsLimit;
    }

}
