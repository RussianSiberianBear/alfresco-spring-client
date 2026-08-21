package com.ecorp.alfresco.exception;

import org.springframework.http.HttpStatusCode;

public class AlfrescoApiException extends RuntimeException {
    private final HttpStatusCode status;
    private final String responseBody;

    public AlfrescoApiException(HttpStatusCode status, String responseBody) {
        super("Alfresco API request failed with HTTP " + status.value() + (responseBody == null || responseBody.isBlank() ? "" : ": " + responseBody));
        this.status = status;
        this.responseBody = responseBody;
    }

    public HttpStatusCode getStatus() {
        return status;
    }

    public String getResponseBody() {
        return responseBody;
    }
}
