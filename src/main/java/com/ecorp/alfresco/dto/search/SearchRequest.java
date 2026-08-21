package com.ecorp.alfresco.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchRequest {
    private RequestQuery query;

    private RequestPagination paging;

    private RequestInclude include;

    private Boolean includeRequest;

    private RequestFields fields;

    private RequestSortDefinition sort;

    private RequestTemplates templates;

    private RequestDefaults defaults;

    private RequestLocalization localization;

    private RequestFilterQueries filterQueries;

    private RequestFacetQueries facetQueries;

    private RequestFacetFields facetFields;

    private RequestFacetIntervals facetIntervals;

    private List<RequestPivot> pivots;

    private List<RequestStats> stats;

    private RequestSpellcheck spellcheck;

    private RequestScope scope;

    private RequestLimits limits;

    private RequestHighlight highlight;

    private List<RequestRange> ranges;

    public SearchRequest() {
    }

    public RequestQuery getQuery() {
        return query;
    }

    public void setQuery(RequestQuery query) {
        this.query = query;
    }

    public RequestPagination getPaging() {
        return paging;
    }

    public void setPaging(RequestPagination paging) {
        this.paging = paging;
    }

    public RequestInclude getInclude() {
        return include;
    }

    public void setInclude(RequestInclude include) {
        this.include = include;
    }

    public Boolean getIncludeRequest() {
        return includeRequest;
    }

    public void setIncludeRequest(Boolean includeRequest) {
        this.includeRequest = includeRequest;
    }

    public RequestFields getFields() {
        return fields;
    }

    public void setFields(RequestFields fields) {
        this.fields = fields;
    }

    public RequestSortDefinition getSort() {
        return sort;
    }

    public void setSort(RequestSortDefinition sort) {
        this.sort = sort;
    }

    public RequestTemplates getTemplates() {
        return templates;
    }

    public void setTemplates(RequestTemplates templates) {
        this.templates = templates;
    }

    public RequestDefaults getDefaults() {
        return defaults;
    }

    public void setDefaults(RequestDefaults defaults) {
        this.defaults = defaults;
    }

    public RequestLocalization getLocalization() {
        return localization;
    }

    public void setLocalization(RequestLocalization localization) {
        this.localization = localization;
    }

    public RequestFilterQueries getFilterQueries() {
        return filterQueries;
    }

    public void setFilterQueries(RequestFilterQueries filterQueries) {
        this.filterQueries = filterQueries;
    }

    public RequestFacetQueries getFacetQueries() {
        return facetQueries;
    }

    public void setFacetQueries(RequestFacetQueries facetQueries) {
        this.facetQueries = facetQueries;
    }

    public RequestFacetFields getFacetFields() {
        return facetFields;
    }

    public void setFacetFields(RequestFacetFields facetFields) {
        this.facetFields = facetFields;
    }

    public RequestFacetIntervals getFacetIntervals() {
        return facetIntervals;
    }

    public void setFacetIntervals(RequestFacetIntervals facetIntervals) {
        this.facetIntervals = facetIntervals;
    }

    public List<RequestPivot> getPivots() {
        return pivots;
    }

    public void setPivots(List<RequestPivot> pivots) {
        this.pivots = pivots;
    }

    public List<RequestStats> getStats() {
        return stats;
    }

    public void setStats(List<RequestStats> stats) {
        this.stats = stats;
    }

    public RequestSpellcheck getSpellcheck() {
        return spellcheck;
    }

    public void setSpellcheck(RequestSpellcheck spellcheck) {
        this.spellcheck = spellcheck;
    }

    public RequestScope getScope() {
        return scope;
    }

    public void setScope(RequestScope scope) {
        this.scope = scope;
    }

    public RequestLimits getLimits() {
        return limits;
    }

    public void setLimits(RequestLimits limits) {
        this.limits = limits;
    }

    public RequestHighlight getHighlight() {
        return highlight;
    }

    public void setHighlight(RequestHighlight highlight) {
        this.highlight = highlight;
    }

    public List<RequestRange> getRanges() {
        return ranges;
    }

    public void setRanges(List<RequestRange> ranges) {
        this.ranges = ranges;
    }

}
