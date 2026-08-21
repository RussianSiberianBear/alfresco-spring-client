package com.ecorp.alfresco.api;

import com.ecorp.alfresco.dto.core.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

import java.time.OffsetDateTime;
import java.util.List;

public interface NodesApi {

    @GetExchange(url = "/nodes/{nodeId}")
    NodeEntry getNode(@PathVariable("nodeId") String nodeId, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "relativePath", required = false) String relativePath, @RequestParam(value = "fields", required = false) List<String> fields);

    @PutExchange(url = "/nodes/{nodeId}")
    NodeEntry updateNode(@PathVariable("nodeId") String nodeId, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody NodeBodyUpdate nodeBodyUpdate);

    @DeleteExchange(url = "/nodes/{nodeId}")
    Void deleteNode(@PathVariable("nodeId") String nodeId, @RequestParam(value = "permanent", required = false) Boolean permanent);

    @GetExchange(url = "/nodes/{nodeId}/children")
    NodeChildAssociationPaging listNodeChildren(@PathVariable("nodeId") String nodeId, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "orderBy", required = false) List<String> orderBy, @RequestParam(value = "where", required = false) String where, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "relativePath", required = false) String relativePath, @RequestParam(value = "includeSource", required = false) Boolean includeSource, @RequestParam(value = "fields", required = false) List<String> fields);

    @PostExchange(url = "/nodes/{nodeId}/children")
    NodeEntry createNode(@PathVariable("nodeId") String nodeId, @RequestParam(value = "autoRename", required = false) Boolean autoRename, @RequestParam(value = "majorVersion", required = false) Boolean majorVersion, @RequestParam(value = "versioningEnabled", required = false) Boolean versioningEnabled, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody NodeBodyCreate nodeBodyCreate);

    @PostExchange(url = "/nodes/{nodeId}/copy")
    NodeEntry copyNode(@PathVariable("nodeId") String nodeId, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody NodeBodyCopy nodeBodyCopy);

    @PostExchange(url = "/nodes/{nodeId}/lock")
    NodeEntry lockNode(@PathVariable("nodeId") String nodeId, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody NodeBodyLock nodeBodyLock);

    @PostExchange(url = "/nodes/{nodeId}/unlock")
    NodeEntry unlockNode(@PathVariable("nodeId") String nodeId, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields);

    @PostExchange(url = "/nodes/{nodeId}/checkout")
    NodeEntry checkoutNode(@PathVariable("nodeId") String nodeId, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields);

    @PostExchange(url = "/nodes/{nodeId}/cancel-checkout")
    NodeEntry cancelCheckoutNode(@PathVariable("nodeId") String nodeId, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields);

    @PostExchange(url = "/nodes/{nodeId}/move")
    NodeEntry moveNode(@PathVariable("nodeId") String nodeId, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody NodeBodyMove nodeBodyMove);

    @GetExchange(url = "/nodes/{nodeId}/content")
    byte[] getNodeContent(@PathVariable("nodeId") String nodeId, @RequestParam(value = "attachment", required = false) Boolean attachment, @RequestHeader(value = "If-Modified-Since", required = false) OffsetDateTime ifModifiedSince, @RequestHeader(value = "Range", required = false) String range);

    @PutExchange(url = "/nodes/{nodeId}/content", contentType = "application/octet-stream")
    NodeEntry updateNodeContent(@PathVariable("nodeId") String nodeId, @RequestParam(value = "majorVersion", required = false) Boolean majorVersion, @RequestParam(value = "comment", required = false) String comment, @RequestParam(value = "name", required = false) String name, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody byte[] contentBodyUpdate);

    @PostExchange(url = "/nodes/{nodeId}/request-direct-access-url")
    DirectAccessUrlEntry requestNodeDirectAccessUrl(@PathVariable("nodeId") String nodeId, @RequestBody DirectAccessUrlBodyCreate requestContentUrlBodyCreate);

    @PostExchange(url = "/nodes/{nodeId}/size-details")
    sizeDetailsRequestResultEntry getNodeSizeDetailsRequest(@PathVariable("nodeId") String nodeId);

    @GetExchange(url = "/nodes/{nodeId}/size-details/{jobId}")
    getNodeSizeDetailsResponse getNodeSizeDetails(@PathVariable("nodeId") String nodeId, @PathVariable("jobId") String jobId);

    @PostExchange(url = "/nodes/{nodeId}/secondary-children")
    ChildAssociationEntry createSecondaryChildAssociation(@PathVariable("nodeId") String nodeId, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody ChildAssociationBody secondaryChildAssociationBodyCreate);

    @GetExchange(url = "/nodes/{nodeId}/secondary-children")
    NodeChildAssociationPaging listSecondaryChildren(@PathVariable("nodeId") String nodeId, @RequestParam(value = "where", required = false) String where, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "includeSource", required = false) Boolean includeSource, @RequestParam(value = "fields", required = false) List<String> fields);

    @DeleteExchange(url = "/nodes/{nodeId}/secondary-children/{childId}")
    Void deleteSecondaryChildAssociation(@PathVariable("nodeId") String nodeId, @PathVariable("childId") String childId, @RequestParam(value = "assocType", required = false) String assocType);

    @GetExchange(url = "/nodes/{nodeId}/parents")
    NodeAssociationPaging listParents(@PathVariable("nodeId") String nodeId, @RequestParam(value = "where", required = false) String where, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "includeSource", required = false) Boolean includeSource, @RequestParam(value = "fields", required = false) List<String> fields);

    @PostExchange(url = "/nodes/{nodeId}/targets")
    AssociationEntry createAssociation(@PathVariable("nodeId") String nodeId, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody AssociationBody associationBodyCreate);

    @GetExchange(url = "/nodes/{nodeId}/targets")
    NodeAssociationPaging listTargetAssociations(@PathVariable("nodeId") String nodeId, @RequestParam(value = "where", required = false) String where, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "fields", required = false) List<String> fields);

    @DeleteExchange(url = "/nodes/{nodeId}/targets/{targetId}")
    Void deleteAssociation(@PathVariable("nodeId") String nodeId, @PathVariable("targetId") String targetId, @RequestParam(value = "assocType", required = false) String assocType);

    @GetExchange(url = "/nodes/{nodeId}/sources")
    NodeAssociationPaging listSourceAssociations(@PathVariable("nodeId") String nodeId, @RequestParam(value = "where", required = false) String where, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "fields", required = false) List<String> fields);
}
