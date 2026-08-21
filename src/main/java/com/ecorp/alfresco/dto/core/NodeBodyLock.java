package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class NodeBodyLock {
    private Integer timeToExpire;

    private String type;

    private String lifetime;

    public NodeBodyLock() {
    }

    public Integer getTimeToExpire() {
        return timeToExpire;
    }

    public void setTimeToExpire(Integer timeToExpire) {
        this.timeToExpire = timeToExpire;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLifetime() {
        return lifetime;
    }

    public void setLifetime(String lifetime) {
        this.lifetime = lifetime;
    }

}
