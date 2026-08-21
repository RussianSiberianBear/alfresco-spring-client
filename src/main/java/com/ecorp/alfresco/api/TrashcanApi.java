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
import java.util.List;

public interface TrashcanApi {

    @GetExchange(url = "/deleted-nodes")
    DeletedNodesPaging listDeletedNodes(@RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "include", required = false) List<String> include);

    @GetExchange(url = "/deleted-nodes/{nodeId}")
    DeletedNodeEntry getDeletedNode(@PathVariable("nodeId") String nodeId, @RequestParam(value = "include", required = false) List<String> include);

    @DeleteExchange(url = "/deleted-nodes/{nodeId}")
    Void deleteDeletedNode(@PathVariable("nodeId") String nodeId);

    @GetExchange(url = "/deleted-nodes/{nodeId}/content")
    byte[] getDeletedNodeContent(@PathVariable("nodeId") String nodeId, @RequestParam(value = "attachment", required = false) Boolean attachment, @RequestHeader(value = "If-Modified-Since", required = false) OffsetDateTime ifModifiedSince, @RequestHeader(value = "Range", required = false) String range);

    @PostExchange(url = "/deleted-nodes/{nodeId}/request-direct-access-url")
    DirectAccessUrlEntry requestDeletedNodeDirectAccessUrl(@PathVariable("nodeId") String nodeId, @RequestBody DirectAccessUrlBodyCreate requestContentUrlBodyCreate);

    @PostExchange(url = "/deleted-nodes/{nodeId}/restore")
    NodeEntry restoreDeletedNode(@PathVariable("nodeId") String nodeId, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody DeletedNodeBodyRestore deletedNodeBodyRestore);

    @GetExchange(url = "/deleted-nodes/{nodeId}/renditions")
    RenditionPaging listDeletedNodeRenditions(@PathVariable("nodeId") String nodeId, @RequestParam(value = "where", required = false) String where);

    @GetExchange(url = "/deleted-nodes/{nodeId}/renditions/{renditionId}")
    RenditionEntry getArchivedNodeRendition(@PathVariable("nodeId") String nodeId, @PathVariable("renditionId") String renditionId);

    @GetExchange(url = "/deleted-nodes/{nodeId}/renditions/{renditionId}/content")
    byte[] getArchivedNodeRenditionContent(@PathVariable("nodeId") String nodeId, @PathVariable("renditionId") String renditionId, @RequestParam(value = "attachment", required = false) Boolean attachment, @RequestHeader(value = "If-Modified-Since", required = false) OffsetDateTime ifModifiedSince, @RequestHeader(value = "Range", required = false) String range, @RequestParam(value = "placeholder", required = false) Boolean placeholder);

    @PostExchange(url = "/deleted-nodes/{nodeId}/renditions/{renditionId}/request-direct-access-url")
    DirectAccessUrlEntry requestArchivedNodeRenditionDirectAccessUrl(@PathVariable("nodeId") String nodeId, @PathVariable("renditionId") String renditionId, @RequestBody DirectAccessUrlBodyCreate requestContentUrlBodyCreate);
}
