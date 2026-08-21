package com.ecorp.alfresco.api;

import com.ecorp.alfresco.dto.core.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.time.OffsetDateTime;

public interface RenditionsApi {

    @PostExchange(url = "/nodes/{nodeId}/renditions")
    Void createRendition(@PathVariable("nodeId") String nodeId, @RequestBody RenditionBodyCreate renditionBodyCreate);

    @GetExchange(url = "/nodes/{nodeId}/renditions")
    RenditionPaging listRenditions(@PathVariable("nodeId") String nodeId, @RequestParam(value = "where", required = false) String where);

    @GetExchange(url = "/nodes/{nodeId}/renditions/{renditionId}")
    RenditionEntry getRendition(@PathVariable("nodeId") String nodeId, @PathVariable("renditionId") String renditionId);

    @DeleteExchange(url = "/nodes/{nodeId}/renditions/{renditionId}")
    Void deleteRendition(@PathVariable("nodeId") String nodeId, @PathVariable("renditionId") String renditionId);

    @GetExchange(url = "/nodes/{nodeId}/renditions/{renditionId}/content")
    byte[] getRenditionContent(@PathVariable("nodeId") String nodeId, @PathVariable("renditionId") String renditionId, @RequestParam(value = "attachment", required = false) Boolean attachment, @RequestHeader(value = "If-Modified-Since", required = false) OffsetDateTime ifModifiedSince, @RequestHeader(value = "Range", required = false) String range, @RequestParam(value = "placeholder", required = false) Boolean placeholder);

    @PostExchange(url = "/nodes/{nodeId}/renditions/{renditionId}/request-direct-access-url")
    DirectAccessUrlEntry requestRenditionDirectAccessUrl(@PathVariable("nodeId") String nodeId, @PathVariable("renditionId") String renditionId, @RequestBody DirectAccessUrlBodyCreate requestContentUrlBodyCreate);
}
