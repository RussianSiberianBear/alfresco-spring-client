package com.ecorp.alfresco.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GenericFacetResponse {
    private String type;

    private String label;

    private List<GenericBucket> buckets;

    public GenericFacetResponse() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<GenericBucket> getBuckets() {
        return buckets;
    }

    public void setBuckets(List<GenericBucket> buckets) {
        this.buckets = buckets;
    }

}
