package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CascadingDictContentDef {
    private List<CascadingDictLevel> levels;

    public CascadingDictContentDef() {
    }

    public List<CascadingDictLevel> getLevels() {
        return levels;
    }

    public void setLevels(List<CascadingDictLevel> levels) {
        this.levels = levels;
    }

}
