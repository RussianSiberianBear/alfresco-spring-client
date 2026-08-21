package com.ecorp.alfresco.api;

import com.ecorp.alfresco.dto.core.NodePaging;
import com.ecorp.alfresco.dto.core.PersonPaging;
import com.ecorp.alfresco.dto.core.SitePaging;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface QueriesApi {

    @GetExchange(url = "/queries/nodes")
    NodePaging findNodes(@RequestParam(value = "term", required = true) String term, @RequestParam(value = "rootNodeId", required = false) String rootNodeId, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "nodeType", required = false) String nodeType, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "orderBy", required = false) List<String> orderBy, @RequestParam(value = "fields", required = false) List<String> fields);

    @GetExchange(url = "/queries/sites")
    SitePaging findSites(@RequestParam(value = "term", required = true) String term, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "orderBy", required = false) List<String> orderBy, @RequestParam(value = "fields", required = false) List<String> fields);

    @GetExchange(url = "/queries/people")
    PersonPaging findPeople(@RequestParam(value = "term", required = true) String term, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "fields", required = false) List<String> fields, @RequestParam(value = "orderBy", required = false) List<String> orderBy);
}
