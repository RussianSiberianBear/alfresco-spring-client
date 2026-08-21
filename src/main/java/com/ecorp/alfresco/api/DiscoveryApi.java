package com.ecorp.alfresco.api;

import com.ecorp.alfresco.dto.discovery.DiscoveryEntry;
import org.springframework.web.service.annotation.GetExchange;

public interface DiscoveryApi {

    @GetExchange(url = "/discovery")
    DiscoveryEntry getRepositoryInformation();
}
