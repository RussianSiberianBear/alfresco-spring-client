package com.ecorp.alfresco.api;

import com.ecorp.alfresco.dto.core.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

public interface ActionsApi {

    @GetExchange(url = "/nodes/{nodeId}/action-definitions")
    ActionDefinitionList nodeActions(@PathVariable("nodeId") String nodeId, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "orderBy", required = false) List<String> orderBy, @RequestParam(value = "fields", required = false) List<String> fields);

    @GetExchange(url = "/action-parameter-constraints/{parameterConstraintName}")
    ActionConstraintEntry getActionConstraint(@PathVariable("parameterConstraintName") String parameterConstraintName);

    @GetExchange(url = "/action-definitions")
    ActionDefinitionList listActions(@RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "orderBy", required = false) List<String> orderBy, @RequestParam(value = "fields", required = false) List<String> fields);

    @GetExchange(url = "/action-definitions/{actionDefinitionId}")
    ActionDefinitionEntry actionDetails(@PathVariable("actionDefinitionId") String actionDefinitionId);

    @PostExchange(url = "/action-executions")
    ActionExecResultEntry actionExec(@RequestBody ActionBodyExec actionBodyExec);
}
