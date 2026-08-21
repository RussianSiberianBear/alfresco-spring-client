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

public interface CascadingDictionariesApi {

    @GetExchange(url = "/cascading-dictionaries")
    CascadingDictList listCascadingDict(@RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems);

    @PostExchange(url = "/cascading-dictionaries")
    CascadingDictCreateEntry createCascadingDict(@RequestBody CascadingDictBodyCreate cascadingDictBodyCreate);

    @PostExchange(url = "/cascading-dictionaries/{aspectId}/content")
    CascadingDictEntry createCascadingDictContent(@PathVariable("aspectId") String aspectId, @RequestParam(value = "majorVersion", required = false) Boolean majorVersion, @RequestBody CascadingDictContentBody cascadingDictContentBody);

    @GetExchange(url = "/cascading-dictionaries/{aspectId}")
    CascadingDictEntry getCascadingDict(@PathVariable("aspectId") String aspectId, @RequestParam(value = "include", required = false) List<String> include);

    @PutExchange(url = "/cascading-dictionaries/{aspectId}")
    CascadingDictUpdateEntry updateCascadingDict(@PathVariable("aspectId") String aspectId, @RequestBody CascadingDictBodyUpdate cascadingDictBodyUpdate);

    @DeleteExchange(url = "/cascading-dictionaries/{aspectId}")
    Void deleteCascadingDict(@PathVariable("aspectId") String aspectId);

    @GetExchange(url = "/cascading-dictionaries/{aspectId}/versions/{versionId}")
    CascadingDictEntry getCascadingDictVersion(@PathVariable("aspectId") String aspectId, @PathVariable("versionId") String versionId, @RequestParam(value = "include", required = false) List<String> include);
}
