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

public interface SharedLinksApi {

    @PostExchange(url = "/shared-links")
    SharedLinkEntry createSharedLink(@RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody SharedLinkBodyCreate sharedLinkBodyCreate);

    @GetExchange(url = "/shared-links")
    SharedLinkPaging listSharedLinks(@RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "where", required = false) String where, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields);

    @GetExchange(url = "/shared-links/{sharedId}")
    SharedLinkEntry getSharedLink(@PathVariable("sharedId") String sharedId, @RequestParam(value = "fields", required = false) List<String> fields);

    @DeleteExchange(url = "/shared-links/{sharedId}")
    Void deleteSharedLink(@PathVariable("sharedId") String sharedId);

    @GetExchange(url = "/shared-links/{sharedId}/content")
    byte[] getSharedLinkContent(@PathVariable("sharedId") String sharedId, @RequestParam(value = "attachment", required = false) Boolean attachment, @RequestHeader(value = "If-Modified-Since", required = false) OffsetDateTime ifModifiedSince, @RequestHeader(value = "Range", required = false) String range);

    @GetExchange(url = "/shared-links/{sharedId}/renditions")
    RenditionPaging listSharedLinkRenditions(@PathVariable("sharedId") String sharedId);

    @GetExchange(url = "/shared-links/{sharedId}/renditions/{renditionId}")
    RenditionEntry getSharedLinkRendition(@PathVariable("sharedId") String sharedId, @PathVariable("renditionId") String renditionId);

    @GetExchange(url = "/shared-links/{sharedId}/renditions/{renditionId}/content")
    byte[] getSharedLinkRenditionContent(@PathVariable("sharedId") String sharedId, @PathVariable("renditionId") String renditionId, @RequestParam(value = "attachment", required = false) Boolean attachment, @RequestHeader(value = "If-Modified-Since", required = false) OffsetDateTime ifModifiedSince, @RequestHeader(value = "Range", required = false) String range);

    @PostExchange(url = "/shared-links/{sharedId}/email")
    Void emailSharedLink(@PathVariable("sharedId") String sharedId, @RequestBody SharedLinkBodyEmail sharedLinkBodyEmail);
}
