package com.ecorp.alfresco.api;

import com.ecorp.alfresco.dto.core.PersonNetworkEntry;
import com.ecorp.alfresco.dto.core.PersonNetworkPaging;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface NetworksApi {

    @GetExchange(url = "/people/{personId}/networks")
    PersonNetworkPaging listNetworksForPerson(@PathVariable("personId") String personId, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "fields", required = false) List<String> fields);

    @GetExchange(url = "/people/{personId}/networks/{networkId}")
    PersonNetworkEntry getNetworkForPerson(@PathVariable("personId") String personId, @PathVariable("networkId") String networkId, @RequestParam(value = "fields", required = false) List<String> fields);

    @GetExchange(url = "/networks/{networkId}")
    PersonNetworkEntry getNetwork(@PathVariable("networkId") String networkId, @RequestParam(value = "fields", required = false) List<String> fields);
}
