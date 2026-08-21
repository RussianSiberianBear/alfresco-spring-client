package com.ecorp.alfresco.api;

import com.ecorp.alfresco.dto.search.ResultSetPaging;
import com.ecorp.alfresco.dto.search.SearchRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.PostExchange;

public interface SearchApi {

    @PostExchange(url = "/search")
    ResultSetPaging search(@RequestBody SearchRequest queryBody);
}
