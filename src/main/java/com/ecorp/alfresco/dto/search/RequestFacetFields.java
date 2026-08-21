package com.ecorp.alfresco.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestFacetFields {
    private List<RequestFacetField> facets;

    public RequestFacetFields() {
    }

    public List<RequestFacetField> getFacets() {
        return facets;
    }

    public void setFacets(List<RequestFacetField> facets) {
        this.facets = facets;
    }

}
