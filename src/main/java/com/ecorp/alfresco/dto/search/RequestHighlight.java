package com.ecorp.alfresco.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestHighlight {
    private String prefix;

    private String postfix;

    private Integer snippetCount;

    private Integer fragmentSize;

    private Integer maxAnalyzedChars;

    private Boolean mergeContiguous;

    private Boolean usePhraseHighlighter;

    private List<Object> fields;

    public RequestHighlight() {
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getPostfix() {
        return postfix;
    }

    public void setPostfix(String postfix) {
        this.postfix = postfix;
    }

    public Integer getSnippetCount() {
        return snippetCount;
    }

    public void setSnippetCount(Integer snippetCount) {
        this.snippetCount = snippetCount;
    }

    public Integer getFragmentSize() {
        return fragmentSize;
    }

    public void setFragmentSize(Integer fragmentSize) {
        this.fragmentSize = fragmentSize;
    }

    public Integer getMaxAnalyzedChars() {
        return maxAnalyzedChars;
    }

    public void setMaxAnalyzedChars(Integer maxAnalyzedChars) {
        this.maxAnalyzedChars = maxAnalyzedChars;
    }

    public Boolean getMergeContiguous() {
        return mergeContiguous;
    }

    public void setMergeContiguous(Boolean mergeContiguous) {
        this.mergeContiguous = mergeContiguous;
    }

    public Boolean getUsePhraseHighlighter() {
        return usePhraseHighlighter;
    }

    public void setUsePhraseHighlighter(Boolean usePhraseHighlighter) {
        this.usePhraseHighlighter = usePhraseHighlighter;
    }

    public List<Object> getFields() {
        return fields;
    }

    public void setFields(List<Object> fields) {
        this.fields = fields;
    }

}
