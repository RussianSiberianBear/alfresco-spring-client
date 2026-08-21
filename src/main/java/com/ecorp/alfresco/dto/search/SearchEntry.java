package com.ecorp.alfresco.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchEntry {
    private Double score;

    private List<Object> highlight;

    public SearchEntry() {
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public List<Object> getHighlight() {
        return highlight;
    }

    public void setHighlight(List<Object> highlight) {
        this.highlight = highlight;
    }

}
