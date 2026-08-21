package com.ecorp.alfresco.api;

import com.ecorp.alfresco.dto.core.DownloadBodyCreate;
import com.ecorp.alfresco.dto.core.DownloadEntry;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

public interface DownloadsApi {

    @PostExchange(url = "/downloads")
    DownloadEntry createDownload(@RequestParam(value = "fields", required = false) List<String> fields, @RequestBody DownloadBodyCreate downloadBodyCreate);

    @GetExchange(url = "/downloads/{downloadId}")
    DownloadEntry getDownload(@PathVariable("downloadId") String downloadId, @RequestParam(value = "fields", required = false) List<String> fields);

    @DeleteExchange(url = "/downloads/{downloadId}")
    Void cancelDownload(@PathVariable("downloadId") String downloadId);
}
