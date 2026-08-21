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

public interface VersionsApi {

    @GetExchange(url = "/nodes/{nodeId}/versions")
    VersionPaging listVersionHistory(@PathVariable("nodeId") String nodeId, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems);

    @GetExchange(url = "/nodes/{nodeId}/versions/{versionId}")
    VersionEntry getVersion(@PathVariable("nodeId") String nodeId, @PathVariable("versionId") String versionId);

    @DeleteExchange(url = "/nodes/{nodeId}/versions/{versionId}")
    Void deleteVersion(@PathVariable("nodeId") String nodeId, @PathVariable("versionId") String versionId);

    @GetExchange(url = "/nodes/{nodeId}/versions/{versionId}/content")
    byte[] getVersionContent(@PathVariable("nodeId") String nodeId, @PathVariable("versionId") String versionId, @RequestParam(value = "attachment", required = false) Boolean attachment, @RequestHeader(value = "If-Modified-Since", required = false) OffsetDateTime ifModifiedSince, @RequestHeader(value = "Range", required = false) String range);

    @PostExchange(url = "/nodes/{nodeId}/versions/{versionId}/request-direct-access-url")
    DirectAccessUrlEntry requestVersionDirectAccessUrl(@PathVariable("nodeId") String nodeId, @PathVariable("versionId") String versionId, @RequestBody DirectAccessUrlBodyCreate requestContentUrlBodyCreate);

    @PostExchange(url = "/nodes/{nodeId}/versions/{versionId}/revert")
    VersionEntry revertVersion(@PathVariable("nodeId") String nodeId, @PathVariable("versionId") String versionId, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody RevertBody revertBody);

    @PostExchange(url = "/nodes/{nodeId}/versions/{versionId}/renditions")
    Void createVersionRendition(@PathVariable("nodeId") String nodeId, @PathVariable("versionId") String versionId, @RequestBody RenditionBodyCreate renditionBodyCreate);

    @GetExchange(url = "/nodes/{nodeId}/versions/{versionId}/renditions")
    RenditionPaging listVersionRenditions(@PathVariable("nodeId") String nodeId, @PathVariable("versionId") String versionId, @RequestParam(value = "where", required = false) String where);

    @GetExchange(url = "/nodes/{nodeId}/versions/{versionId}/renditions/{renditionId}")
    RenditionEntry getVersionRendition(@PathVariable("nodeId") String nodeId, @PathVariable("versionId") String versionId, @PathVariable("renditionId") String renditionId);

    @DeleteExchange(url = "/nodes/{nodeId}/versions/{versionId}/renditions/{renditionId}")
    Void deleteVersionRendition(@PathVariable("nodeId") String nodeId, @PathVariable("versionId") String versionId, @PathVariable("renditionId") String renditionId);

    @GetExchange(url = "/nodes/{nodeId}/versions/{versionId}/renditions/{renditionId}/content")
    byte[] getVersionRenditionContent(@PathVariable("nodeId") String nodeId, @PathVariable("versionId") String versionId, @PathVariable("renditionId") String renditionId, @RequestParam(value = "attachment", required = false) Boolean attachment, @RequestHeader(value = "If-Modified-Since", required = false) OffsetDateTime ifModifiedSince, @RequestHeader(value = "Range", required = false) String range, @RequestParam(value = "placeholder", required = false) Boolean placeholder);

    @PostExchange(url = "/nodes/{nodeId}/versions/{versionId}/renditions/{renditionId}/request-direct-access-url")
    DirectAccessUrlEntry requestVersionRenditionDirectAccessUrl(@PathVariable("nodeId") String nodeId, @PathVariable("versionId") String versionId, @PathVariable("renditionId") String renditionId, @RequestBody DirectAccessUrlBodyCreate requestContentUrlBodyCreate);
}
