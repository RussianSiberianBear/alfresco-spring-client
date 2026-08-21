package com.ecorp.alfresco.dto.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteMember {
    private String id;

    private Person person;

    private String role;

    private Boolean isMemberOfGroup;

    public SiteMember() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getIsMemberOfGroup() {
        return isMemberOfGroup;
    }

    public void setIsMemberOfGroup(Boolean isMemberOfGroup) {
        this.isMemberOfGroup = isMemberOfGroup;
    }

}
