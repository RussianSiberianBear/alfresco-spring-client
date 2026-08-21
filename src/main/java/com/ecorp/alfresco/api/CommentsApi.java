package com.ecorp.alfresco.api;

import com.ecorp.alfresco.dto.core.CommentBody;
import com.ecorp.alfresco.dto.core.CommentEntry;
import com.ecorp.alfresco.dto.core.CommentPaging;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

import java.util.List;

public interface CommentsApi {

    @GetExchange(url = "/nodes/{nodeId}/comments")
    CommentPaging listComments(@PathVariable("nodeId") String nodeId, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "fields", required = false) List<String> fields);

    @PostExchange(url = "/nodes/{nodeId}/comments")
    CommentEntry createComment(@PathVariable("nodeId") String nodeId, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody CommentBody commentBodyCreate);

    @PutExchange(url = "/nodes/{nodeId}/comments/{commentId}")
    CommentEntry updateComment(@PathVariable("nodeId") String nodeId, @PathVariable("commentId") String commentId, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody CommentBody commentBodyUpdate);

    @DeleteExchange(url = "/nodes/{nodeId}/comments/{commentId}")
    Void deleteComment(@PathVariable("nodeId") String nodeId, @PathVariable("commentId") String commentId);
}
