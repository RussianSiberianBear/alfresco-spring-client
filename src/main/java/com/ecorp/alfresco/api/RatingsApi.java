package com.ecorp.alfresco.api;

import com.ecorp.alfresco.dto.core.RatingBody;
import com.ecorp.alfresco.dto.core.RatingEntry;
import com.ecorp.alfresco.dto.core.RatingPaging;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

public interface RatingsApi {

    @GetExchange(url = "/nodes/{nodeId}/ratings")
    RatingPaging listRatings(@PathVariable("nodeId") String nodeId, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "fields", required = false) List<String> fields);

    @PostExchange(url = "/nodes/{nodeId}/ratings")
    RatingEntry createRating(@PathVariable("nodeId") String nodeId, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody RatingBody ratingBodyCreate);

    @GetExchange(url = "/nodes/{nodeId}/ratings/{ratingId}")
    RatingEntry getRating(@PathVariable("nodeId") String nodeId, @PathVariable("ratingId") String ratingId, @RequestParam(value = "fields", required = false) List<String> fields);

    @DeleteExchange(url = "/nodes/{nodeId}/ratings/{ratingId}")
    Void deleteRating(@PathVariable("nodeId") String nodeId, @PathVariable("ratingId") String ratingId);
}
