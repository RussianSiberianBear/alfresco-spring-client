package com.ecorp.alfresco.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseConsistency {
    private Integer lastTxId;

    public ResponseConsistency() {
    }

    public Integer getLastTxId() {
        return lastTxId;
    }

    public void setLastTxId(Integer lastTxId) {
        this.lastTxId = lastTxId;
    }

}
