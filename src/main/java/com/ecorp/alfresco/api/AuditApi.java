package com.ecorp.alfresco.api;

import com.ecorp.alfresco.dto.core.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PutExchange;

import java.util.List;

public interface AuditApi {

    @GetExchange(url = "/audit-applications")
    AuditAppPaging listAuditApps(@RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "fields", required = false) List<String> fields);

    @GetExchange(url = "/audit-applications/{auditApplicationId}")
    AuditApp getAuditApp(@PathVariable("auditApplicationId") String auditApplicationId, @RequestParam(value = "fields", required = false) List<String> fields, @RequestParam(value = "include", required = false) List<String> include);

    @PutExchange(url = "/audit-applications/{auditApplicationId}")
    AuditApp updateAuditApp(@PathVariable("auditApplicationId") String auditApplicationId, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody AuditBodyUpdate auditAppBodyUpdate);

    @GetExchange(url = "/audit-applications/{auditApplicationId}/audit-entries")
    AuditEntryPaging listAuditEntriesForAuditApp(@PathVariable("auditApplicationId") String auditApplicationId, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "omitTotalItems", required = false) Boolean omitTotalItems, @RequestParam(value = "orderBy", required = false) List<String> orderBy, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "where", required = false) String where, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields);

    @DeleteExchange(url = "/audit-applications/{auditApplicationId}/audit-entries")
    Void deleteAuditEntriesForAuditApp(@PathVariable("auditApplicationId") String auditApplicationId, @RequestParam(value = "where", required = true) String where);

    @GetExchange(url = "/audit-applications/{auditApplicationId}/audit-entries/{auditEntryId}")
    AuditEntryEntry getAuditEntry(@PathVariable("auditApplicationId") String auditApplicationId, @PathVariable("auditEntryId") String auditEntryId, @RequestParam(value = "fields", required = false) List<String> fields);

    @DeleteExchange(url = "/audit-applications/{auditApplicationId}/audit-entries/{auditEntryId}")
    Void deleteAuditEntry(@PathVariable("auditApplicationId") String auditApplicationId, @PathVariable("auditEntryId") String auditEntryId);

    @GetExchange(url = "/nodes/{nodeId}/audit-entries")
    AuditEntryPaging listAuditEntriesForNode(@PathVariable("nodeId") String nodeId, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "orderBy", required = false) List<String> orderBy, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "where", required = false) String where, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields);
}
