package com.ecorp.alfresco.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pagination {
    private Long count;

    private Boolean hasMoreItems;

    private Long totalItems;

    private Long skipCount;

    private Long maxItems;

    public Pagination() {
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Boolean getHasMoreItems() {
        return hasMoreItems;
    }

    public void setHasMoreItems(Boolean hasMoreItems) {
        this.hasMoreItems = hasMoreItems;
    }

    public Long getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Long totalItems) {
        this.totalItems = totalItems;
    }

    public Long getSkipCount() {
        return skipCount;
    }

    public void setSkipCount(Long skipCount) {
        this.skipCount = skipCount;
    }

    public Long getMaxItems() {
        return maxItems;
    }

    public void setMaxItems(Long maxItems) {
        this.maxItems = maxItems;
    }

}
