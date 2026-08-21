package com.ecorp.alfresco.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultBuckets {
    private String label;

    private List<Object> buckets;

    public ResultBuckets() {
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Object> getBuckets() {
        return buckets;
    }

    public void setBuckets(List<Object> buckets) {
        this.buckets = buckets;
    }

}
