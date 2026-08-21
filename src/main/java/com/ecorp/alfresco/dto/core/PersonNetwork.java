package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.OffsetDateTime;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonNetwork {
    private String id;

    private Boolean homeNetwork;

    private Boolean isEnabled;

    private OffsetDateTime createdAt;

    private Boolean paidNetwork;

    private String subscriptionLevel;

    private List<NetworkQuota> quotas;

    public PersonNetwork() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getHomeNetwork() {
        return homeNetwork;
    }

    public void setHomeNetwork(Boolean homeNetwork) {
        this.homeNetwork = homeNetwork;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getPaidNetwork() {
        return paidNetwork;
    }

    public void setPaidNetwork(Boolean paidNetwork) {
        this.paidNetwork = paidNetwork;
    }

    public String getSubscriptionLevel() {
        return subscriptionLevel;
    }

    public void setSubscriptionLevel(String subscriptionLevel) {
        this.subscriptionLevel = subscriptionLevel;
    }

    public List<NetworkQuota> getQuotas() {
        return quotas;
    }

    public void setQuotas(List<NetworkQuota> quotas) {
        this.quotas = quotas;
    }

}
