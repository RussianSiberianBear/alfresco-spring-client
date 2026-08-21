package com.ecorp.alfresco.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestRange {
    private String field;

    private String start;

    private String end;

    private String gap;

    private Boolean hardend;

    private List<String> other;

    private List<String> include;

    private String label;

    private List<String> excludeFilters;

    public RequestRange() {
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getGap() {
        return gap;
    }

    public void setGap(String gap) {
        this.gap = gap;
    }

    public Boolean getHardend() {
        return hardend;
    }

    public void setHardend(Boolean hardend) {
        this.hardend = hardend;
    }

    public List<String> getOther() {
        return other;
    }

    public void setOther(List<String> other) {
        this.other = other;
    }

    public List<String> getInclude() {
        return include;
    }

    public void setInclude(List<String> include) {
        this.include = include;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<String> getExcludeFilters() {
        return excludeFilters;
    }

    public void setExcludeFilters(List<String> excludeFilters) {
        this.excludeFilters = excludeFilters;
    }

}
