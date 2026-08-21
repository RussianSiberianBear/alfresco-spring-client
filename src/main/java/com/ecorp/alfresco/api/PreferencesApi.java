package com.ecorp.alfresco.api;

import com.ecorp.alfresco.dto.core.PreferenceBodyUpdate;
import com.ecorp.alfresco.dto.core.PreferenceEntry;
import com.ecorp.alfresco.dto.core.PreferencePaging;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PutExchange;

import java.util.List;

public interface PreferencesApi {

    @GetExchange(url = "/people/{personId}/preferences")
    PreferencePaging listPreferences(@PathVariable("personId") String personId, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "fields", required = false) List<String> fields);

    @GetExchange(url = "/people/{personId}/preferences/{preferenceName}")
    PreferenceEntry getPreference(@PathVariable("personId") String personId, @PathVariable("preferenceName") String preferenceName, @RequestParam(value = "fields", required = false) List<String> fields);

    @PutExchange(url = "/people/{personId}/preferences/{preferenceName}")
    PreferenceEntry updatePreference(@PathVariable("personId") String personId, @PathVariable("preferenceName") String preferenceName, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody PreferenceBodyUpdate preferenceBodyUpdate);
}
