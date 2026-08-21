package com.ecorp.alfresco.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestFacetIntervals {
    private List<RequestFacetSet> sets;

    private List<Object> intervals;

    public RequestFacetIntervals() {
    }

    public List<RequestFacetSet> getSets() {
        return sets;
    }

    public void setSets(List<RequestFacetSet> sets) {
        this.sets = sets;
    }

    public List<Object> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<Object> intervals) {
        this.intervals = intervals;
    }

}
