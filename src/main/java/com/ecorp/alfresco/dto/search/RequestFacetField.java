package com.ecorp.alfresco.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestFacetField {
    private String field;

    private String label;

    private String prefix;

    private String sort;

    private String method;

    private Boolean missing;

    private Integer limit;

    private Integer offset;

    private Integer mincount;

    private Integer facetEnumCacheMinDf;

    private List<String> excludeFilters;

    public RequestFacetField() {
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Boolean getMissing() {
        return missing;
    }

    public void setMissing(Boolean missing) {
        this.missing = missing;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getMincount() {
        return mincount;
    }

    public void setMincount(Integer mincount) {
        this.mincount = mincount;
    }

    public Integer getFacetEnumCacheMinDf() {
        return facetEnumCacheMinDf;
    }

    public void setFacetEnumCacheMinDf(Integer facetEnumCacheMinDf) {
        this.facetEnumCacheMinDf = facetEnumCacheMinDf;
    }

    public List<String> getExcludeFilters() {
        return excludeFilters;
    }

    public void setExcludeFilters(List<String> excludeFilters) {
        this.excludeFilters = excludeFilters;
    }

}
