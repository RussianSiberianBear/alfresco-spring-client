package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.OffsetDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rating {
    private String id;

    private Object aggregate;

    private OffsetDateTime ratedAt;

    private String myRating;

    public Rating() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getAggregate() {
        return aggregate;
    }

    public void setAggregate(Object aggregate) {
        this.aggregate = aggregate;
    }

    public OffsetDateTime getRatedAt() {
        return ratedAt;
    }

    public void setRatedAt(OffsetDateTime ratedAt) {
        this.ratedAt = ratedAt;
    }

    public String getMyRating() {
        return myRating;
    }

    public void setMyRating(String myRating) {
        this.myRating = myRating;
    }

}
