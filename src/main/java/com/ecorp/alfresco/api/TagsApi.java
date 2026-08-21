package com.ecorp.alfresco.api;

import com.ecorp.alfresco.dto.core.TagBody;
import com.ecorp.alfresco.dto.core.TagEntry;
import com.ecorp.alfresco.dto.core.TagPaging;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

import java.util.List;

public interface TagsApi {

    @GetExchange(url = "/nodes/{nodeId}/tags")
    TagPaging listTagsForNode(@PathVariable("nodeId") String nodeId, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "fields", required = false) List<String> fields);

    @PostExchange(url = "/nodes/{nodeId}/tags")
    TagEntry createTagForNode(@PathVariable("nodeId") String nodeId, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody TagBody tagBodyCreate);

    @DeleteExchange(url = "/nodes/{nodeId}/tags/{tagId}")
    Void deleteTagFromNode(@PathVariable("nodeId") String nodeId, @PathVariable("tagId") String tagId);

    @GetExchange(url = "/tags")
    TagPaging listTags(@RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "fields", required = false) List<String> fields, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "orderBy", required = false) List<String> orderBy, @RequestParam(value = "where", required = false) String where);

    @PostExchange(url = "/tags")
    TagEntry createTag(@RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody TagBody tagBodyCreate);

    @GetExchange(url = "/tags/{tagId}")
    TagEntry getTag(@PathVariable("tagId") String tagId, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields);

    @PutExchange(url = "/tags/{tagId}")
    TagEntry updateTag(@PathVariable("tagId") String tagId, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody TagBody tagBodyUpdate);

    @DeleteExchange(url = "/tags/{tagId}")
    Void deleteTag(@PathVariable("tagId") String tagId);
}
