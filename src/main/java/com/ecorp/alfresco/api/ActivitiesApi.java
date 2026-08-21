package com.ecorp.alfresco.api;

import com.ecorp.alfresco.dto.core.ActivityPaging;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface ActivitiesApi {

    @GetExchange(url = "/people/{personId}/activities")
    ActivityPaging listActivitiesForPerson(@PathVariable("personId") String personId, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "who", required = false) String who, @RequestParam(value = "siteId", required = false) String siteId, @RequestParam(value = "fields", required = false) List<String> fields);
}
