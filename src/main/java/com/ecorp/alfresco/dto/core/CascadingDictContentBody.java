package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CascadingDictContentBody {
    private CascadingDictContentDef definition;

    private List<CascadingDictItem> data;

    public CascadingDictContentBody() {
    }

    public CascadingDictContentDef getDefinition() {
        return definition;
    }

    public void setDefinition(CascadingDictContentDef definition) {
        this.definition = definition;
    }

    public List<CascadingDictItem> getData() {
        return data;
    }

    public void setData(List<CascadingDictItem> data) {
        this.data = data;
    }

}
