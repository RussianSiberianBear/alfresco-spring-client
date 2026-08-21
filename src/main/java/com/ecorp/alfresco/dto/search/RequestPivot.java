package com.ecorp.alfresco.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestPivot {
    private String key;

    private List<RequestPivot> pivots;

    public RequestPivot() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<RequestPivot> getPivots() {
        return pivots;
    }

    public void setPivots(List<RequestPivot> pivots) {
        this.pivots = pivots;
    }

}
