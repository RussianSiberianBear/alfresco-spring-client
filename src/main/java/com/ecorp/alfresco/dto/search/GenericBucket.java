package com.ecorp.alfresco.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GenericBucket {
    private String label;

    private String filterQuery;

    private Map<String, Object> display;

    private List<GenericMetric> metrics;

    private List<Map<String, Object>> facets;

    private Object bucketInfo;

    public GenericBucket() {
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getFilterQuery() {
        return filterQuery;
    }

    public void setFilterQuery(String filterQuery) {
        this.filterQuery = filterQuery;
    }

    public Map<String, Object> getDisplay() {
        return display;
    }

    public void setDisplay(Map<String, Object> display) {
        this.display = display;
    }

    public List<GenericMetric> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<GenericMetric> metrics) {
        this.metrics = metrics;
    }

    public List<Map<String, Object>> getFacets() {
        return facets;
    }

    public void setFacets(List<Map<String, Object>> facets) {
        this.facets = facets;
    }

    public Object getBucketInfo() {
        return bucketInfo;
    }

    public void setBucketInfo(Object bucketInfo) {
        this.bucketInfo = bucketInfo;
    }

}
