package com.ecorp.alfresco.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestFacetSet {
    private String label;

    private String start;

    private String end;

    private Boolean startInclusive;

    private Boolean endInclusive;

    public RequestFacetSet() {
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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

    public Boolean getStartInclusive() {
        return startInclusive;
    }

    public void setStartInclusive(Boolean startInclusive) {
        this.startInclusive = startInclusive;
    }

    public Boolean getEndInclusive() {
        return endInclusive;
    }

    public void setEndInclusive(Boolean endInclusive) {
        this.endInclusive = endInclusive;
    }

}
