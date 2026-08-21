package com.ecorp.alfresco.api;

import com.ecorp.alfresco.dto.core.ProbeEntry;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;

public interface ProbesApi {

    @GetExchange(url = "/probes/{probeId}")
    ProbeEntry getProbe(@PathVariable("probeId") String probeId);
}
