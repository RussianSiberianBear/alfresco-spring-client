package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PreferencePaging {
    private Object list;

    public PreferencePaging() {
    }

    public Object getList() {
        return list;
    }

    public void setList(Object list) {
        this.list = list;
    }

}
