package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.OffsetDateTime;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Activity {
    private String postPersonId;

    private Long id;

    private String siteId;

    private OffsetDateTime postedAt;

    private String feedPersonId;

    private Map<String, String> activitySummary;

    private String activityType;

    public Activity() {
    }

    public String getPostPersonId() {
        return postPersonId;
    }

    public void setPostPersonId(String postPersonId) {
        this.postPersonId = postPersonId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public OffsetDateTime getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(OffsetDateTime postedAt) {
        this.postedAt = postedAt;
    }

    public String getFeedPersonId() {
        return feedPersonId;
    }

    public void setFeedPersonId(String feedPersonId) {
        this.feedPersonId = feedPersonId;
    }

    public Map<String, String> getActivitySummary() {
        return activitySummary;
    }

    public void setActivitySummary(Map<String, String> activitySummary) {
        this.activitySummary = activitySummary;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

}
