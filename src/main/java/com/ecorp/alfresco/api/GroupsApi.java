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

public interface GroupsApi {

    @GetExchange(url = "/people/{personId}/groups")
    GroupPaging listGroupMembershipsForPerson(@PathVariable("personId") String personId, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "orderBy", required = false) List<String> orderBy, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "where", required = false) String where, @RequestParam(value = "fields", required = false) List<String> fields);

    @GetExchange(url = "/groups")
    GroupPaging listGroups(@RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "orderBy", required = false) List<String> orderBy, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "where", required = false) String where, @RequestParam(value = "fields", required = false) List<String> fields);

    @PostExchange(url = "/groups")
    GroupEntry createGroup(@RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody GroupBodyCreate groupBodyCreate);

    @GetExchange(url = "/groups/{groupId}")
    GroupEntry getGroup(@PathVariable("groupId") String groupId, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields);

    @PutExchange(url = "/groups/{groupId}")
    GroupEntry updateGroup(@PathVariable("groupId") String groupId, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody GroupBodyUpdate groupBodyUpdate);

    @DeleteExchange(url = "/groups/{groupId}")
    Void deleteGroup(@PathVariable("groupId") String groupId, @RequestParam(value = "cascade", required = false) Boolean cascade);

    @PostExchange(url = "/groups/{groupId}/members")
    GroupMemberEntry createGroupMembership(@PathVariable("groupId") String groupId, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody GroupMembershipBodyCreate groupMembershipBodyCreate);

    @GetExchange(url = "/groups/{groupId}/members")
    GroupMemberPaging listGroupMemberships(@PathVariable("groupId") String groupId, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "orderBy", required = false) List<String> orderBy, @RequestParam(value = "where", required = false) String where, @RequestParam(value = "fields", required = false) List<String> fields);

    @DeleteExchange(url = "/groups/{groupId}/members/{groupMemberId}")
    Void deleteGroupMembership(@PathVariable("groupId") String groupId, @PathVariable("groupMemberId") String groupMemberId);
}
