package com.ecorp.alfresco.api;

import com.ecorp.alfresco.dto.core.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

import java.time.OffsetDateTime;
import java.util.List;

public interface PeopleApi {

    @PostExchange(url = "/people")
    PersonEntry createPerson(@RequestParam(value = "fields", required = false) List<String> fields, @RequestBody PersonBodyCreate personBodyCreate);

    @GetExchange(url = "/people")
    PersonPaging listPeople(@RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "orderBy", required = false) List<String> orderBy, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields);

    @GetExchange(url = "/people/{personId}")
    PersonEntry getPerson(@PathVariable("personId") String personId, @RequestParam(value = "fields", required = false) List<String> fields);

    @PutExchange(url = "/people/{personId}")
    PersonEntry updatePerson(@PathVariable("personId") String personId, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody PersonBodyUpdate personBodyUpdate);

    @PostExchange(url = "/people/{personId}/request-password-reset")
    Void requestPasswordReset(@PathVariable("personId") String personId, @RequestBody ClientBody clientBody);

    @PostExchange(url = "/people/{personId}/reset-password")
    Void resetPassword(@PathVariable("personId") String personId, @RequestBody PasswordResetBody passwordResetBody);

    @GetExchange(url = "/people/{personId}/avatar")
    byte[] getAvatarImage(@PathVariable("personId") String personId, @RequestParam(value = "attachment", required = false) Boolean attachment, @RequestHeader(value = "If-Modified-Since", required = false) OffsetDateTime ifModifiedSince, @RequestParam(value = "placeholder", required = false) Boolean placeholder);

    @PutExchange(url = "/people/{personId}/avatar", contentType = "application/octet-stream")
    Void updateAvatarImage(@PathVariable("personId") String personId, @RequestBody byte[] contentBodyUpdate);

    @DeleteExchange(url = "/people/{personId}/avatar")
    Void deleteAvatarImage(@PathVariable("personId") String personId);

    @PostExchange(url = "/people/{personId}/deauthorize")
    Void deauthorizeUser(@PathVariable("personId") String personId);

    @PostExchange(url = "/people/{personId}/reauthorization-code")
    AuthCodeEntry reauthorizationCode(@PathVariable("personId") String personId);

    @PostExchange(url = "/people/{personId}/reauthorize")
    Void reauthorizeUser(@PathVariable("personId") String personId, @RequestBody AuthKey authorizationKey);
}
