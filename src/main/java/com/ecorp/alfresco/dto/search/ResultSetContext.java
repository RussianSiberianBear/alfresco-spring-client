package com.ecorp.alfresco.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultSetContext {
    private ResponseConsistency consistency;

    private SearchRequest request;

    private List<Object> facetQueries;

    private List<ResultBuckets> facetsFields;

    private List<GenericFacetResponse> facets;

    private List<Object> spellcheck;

    public ResultSetContext() {
    }

    public ResponseConsistency getConsistency() {
        return consistency;
    }

    public void setConsistency(ResponseConsistency consistency) {
        this.consistency = consistency;
    }

    public SearchRequest getRequest() {
        return request;
    }

    public void setRequest(SearchRequest request) {
        this.request = request;
    }

    public List<Object> getFacetQueries() {
        return facetQueries;
    }

    public void setFacetQueries(List<Object> facetQueries) {
        this.facetQueries = facetQueries;
    }

    public List<ResultBuckets> getFacetsFields() {
        return facetsFields;
    }

    public void setFacetsFields(List<ResultBuckets> facetsFields) {
        this.facetsFields = facetsFields;
    }

    public List<GenericFacetResponse> getFacets() {
        return facets;
    }

    public void setFacets(List<GenericFacetResponse> facets) {
        this.facets = facets;
    }

    public List<Object> getSpellcheck() {
        return spellcheck;
    }

    public void setSpellcheck(List<Object> spellcheck) {
        this.spellcheck = spellcheck;
    }

}
