package com.ecorp.alfresco.api;

import com.ecorp.alfresco.dto.core.ArchiveContentRequest;
import com.ecorp.alfresco.dto.core.ContentStorageInfo;
import com.ecorp.alfresco.dto.core.RestoreArchivedContentRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;

public interface StorageInfoApi {

    @GetExchange(url = "/nodes/{nodeId}/storage-info/{contentPropName}")
    ContentStorageInfo getStorageProperties(@PathVariable("nodeId") String nodeId, @PathVariable("contentPropName") String contentPropName);

    @GetExchange(url = "/nodes/{nodeId}/versions/{versionId}/storage-info/{contentPropName}")
    ContentStorageInfo getVersionStorageProperties(@PathVariable("nodeId") String nodeId, @PathVariable("versionId") String versionId, @PathVariable("contentPropName") String contentPropName);

    @PostExchange(url = "/nodes/{nodeId}/storage-info/{contentPropName}/archive")
    Void requestArchiveContent(@PathVariable("nodeId") String nodeId, @PathVariable("contentPropName") String contentPropName, @RequestBody ArchiveContentRequest archiveContentRequest);

    @PostExchange(url = "/nodes/{nodeId}/versions/{versionId}/storage-info/{contentPropName}/archive")
    Void requestArchiveVersionContent(@PathVariable("nodeId") String nodeId, @PathVariable("versionId") String versionId, @PathVariable("contentPropName") String contentPropName, @RequestBody ArchiveContentRequest archiveContentRequest);

    @PostExchange(url = "/nodes/{nodeId}/storage-info/{contentPropName}/archive-restore")
    Void requestRestoreContentFromArchive(@PathVariable("nodeId") String nodeId, @PathVariable("contentPropName") String contentPropName, @RequestBody RestoreArchivedContentRequest restoreArchivedContentRequest);

    @PostExchange(url = "/nodes/{nodeId}/versions/{versionId}/storage-info/{contentPropName}/archive-restore")
    Void requestRestoreVersionContentFromArchive(@PathVariable("nodeId") String nodeId, @PathVariable("versionId") String versionId, @PathVariable("contentPropName") String contentPropName, @RequestBody RestoreArchivedContentRequest restoreArchivedContentRequest);
}
