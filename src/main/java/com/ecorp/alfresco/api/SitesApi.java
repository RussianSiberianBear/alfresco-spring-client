package com.ecorp.alfresco.api;

import com.ecorp.alfresco.dto.core.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

import java.util.List;

public interface SitesApi {

    @GetExchange(url = "/people/{personId}/site-membership-requests")
    SiteMembershipRequestPaging listSiteMembershipRequestsForPerson(@PathVariable("personId") String personId, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "fields", required = false) List<String> fields);

    @PostExchange(url = "/people/{personId}/site-membership-requests")
    SiteMembershipRequestEntry createSiteMembershipRequestForPerson(@PathVariable("personId") String personId, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody SiteMembershipRequestBodyCreate siteMembershipRequestBodyCreate);

    @GetExchange(url = "/people/{personId}/site-membership-requests/{siteId}")
    SiteMembershipRequestEntry getSiteMembershipRequestForPerson(@PathVariable("personId") String personId, @PathVariable("siteId") String siteId, @RequestParam(value = "fields", required = false) List<String> fields);

    @PutExchange(url = "/people/{personId}/site-membership-requests/{siteId}")
    SiteMembershipRequestEntry updateSiteMembershipRequestForPerson(@PathVariable("personId") String personId, @PathVariable("siteId") String siteId, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody SiteMembershipRequestBodyUpdate siteMembershipRequestBodyUpdate);

    @DeleteExchange(url = "/people/{personId}/site-membership-requests/{siteId}")
    Void deleteSiteMembershipRequestForPerson(@PathVariable("personId") String personId, @PathVariable("siteId") String siteId);

    @GetExchange(url = "/people/{personId}/sites")
    SiteRolePaging listSiteMembershipsForPerson(@PathVariable("personId") String personId, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "orderBy", required = false) List<String> orderBy, @RequestParam(value = "relations", required = false) List<String> relations, @RequestParam(value = "fields", required = false) List<String> fields, @RequestParam(value = "where", required = false) String where);

    @GetExchange(url = "/people/{personId}/sites/{siteId}")
    SiteRoleEntry getSiteMembershipForPerson(@PathVariable("personId") String personId, @PathVariable("siteId") String siteId);

    @DeleteExchange(url = "/people/{personId}/sites/{siteId}")
    Void deleteSiteMembershipForPerson(@PathVariable("personId") String personId, @PathVariable("siteId") String siteId);

    @GetExchange(url = "/sites")
    SitePaging listSites(@RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "orderBy", required = false) List<String> orderBy, @RequestParam(value = "relations", required = false) List<String> relations, @RequestParam(value = "fields", required = false) List<String> fields, @RequestParam(value = "where", required = false) String where);

    @PostExchange(url = "/sites")
    SiteEntry createSite(@RequestParam(value = "skipConfiguration", required = false) Boolean skipConfiguration, @RequestParam(value = "skipAddToFavorites", required = false) Boolean skipAddToFavorites, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody SiteBodyCreate siteBodyCreate);

    @GetExchange(url = "/sites/{siteId}")
    SiteEntry getSite(@PathVariable("siteId") String siteId, @RequestParam(value = "relations", required = false) List<String> relations, @RequestParam(value = "fields", required = false) List<String> fields);

    @PutExchange(url = "/sites/{siteId}")
    SiteEntry updateSite(@PathVariable("siteId") String siteId, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody SiteBodyUpdate siteBodyUpdate);

    @DeleteExchange(url = "/sites/{siteId}")
    Void deleteSite(@PathVariable("siteId") String siteId, @RequestParam(value = "permanent", required = false) Boolean permanent);

    @GetExchange(url = "/sites/{siteId}/containers")
    SiteContainerPaging listSiteContainers(@PathVariable("siteId") String siteId, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "fields", required = false) List<String> fields);

    @GetExchange(url = "/sites/{siteId}/containers/{containerId}")
    SiteContainerEntry getSiteContainer(@PathVariable("siteId") String siteId, @PathVariable("containerId") String containerId, @RequestParam(value = "fields", required = false) List<String> fields);

    @GetExchange(url = "/site-membership-requests")
    SiteMembershipRequestWithPersonPaging getSiteMembershipRequests(@RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "where", required = false) String where, @RequestParam(value = "fields", required = false) List<String> fields);

    @PostExchange(url = "/sites/{siteId}/site-membership-requests/{inviteeId}/approve")
    Void approveSiteMembershipRequest(@PathVariable("siteId") String siteId, @PathVariable("inviteeId") String inviteeId, @RequestBody SiteMembershipApprovalBody siteMembershipApprovalBody);

    @PostExchange(url = "/sites/{siteId}/site-membership-requests/{inviteeId}/reject")
    Void rejectSiteMembershipRequest(@PathVariable("siteId") String siteId, @PathVariable("inviteeId") String inviteeId, @RequestBody SiteMembershipRejectionBody siteMembershipRejectionBody);

    @GetExchange(url = "/sites/{siteId}/members")
    SiteMemberPaging listSiteMemberships(@PathVariable("siteId") String siteId, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "fields", required = false) List<String> fields, @RequestParam(value = "where", required = false) String where);

    @PostExchange(url = "/sites/{siteId}/members")
    SiteMemberEntry createSiteMembership(@PathVariable("siteId") String siteId, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody SiteMembershipBodyCreate siteMembershipBodyCreate);

    @GetExchange(url = "/sites/{siteId}/members/{personId}")
    SiteMemberEntry getSiteMembership(@PathVariable("siteId") String siteId, @PathVariable("personId") String personId, @RequestParam(value = "fields", required = false) List<String> fields);

    @PutExchange(url = "/sites/{siteId}/members/{personId}")
    SiteMemberEntry updateSiteMembership(@PathVariable("siteId") String siteId, @PathVariable("personId") String personId, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody SiteMembershipBodyUpdate siteMembershipBodyUpdate);

    @DeleteExchange(url = "/sites/{siteId}/members/{personId}")
    Void deleteSiteMembership(@PathVariable("siteId") String siteId, @PathVariable("personId") String personId);

    @GetExchange(url = "/sites/{siteId}/group-members")
    SiteGroupPaging listSiteGroups(@PathVariable("siteId") String siteId, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "fields", required = false) List<String> fields);

    @PostExchange(url = "/sites/{siteId}/group-members")
    SiteGroupEntry createSiteGroupMembership(@PathVariable("siteId") String siteId, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody SiteMembershipBodyCreate siteMembershipBodyCreate);

    @GetExchange(url = "/sites/{siteId}/group-members/{groupId}")
    SiteGroupEntry getSiteGroupMembership(@PathVariable("siteId") String siteId, @PathVariable("groupId") String groupId, @RequestParam(value = "fields", required = false) List<String> fields);

    @PutExchange(url = "/sites/{siteId}/group-members/{groupId}")
    SiteGroupEntry updateSiteGroupMembership(@PathVariable("siteId") String siteId, @PathVariable("groupId") String groupId, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody SiteMembershipBodyUpdate siteMembershipBodyUpdate);

    @DeleteExchange(url = "/sites/{siteId}/group-members/{groupId}")
    Void deleteSiteGroupMembership(@PathVariable("siteId") String siteId, @PathVariable("groupId") String groupId);
}
