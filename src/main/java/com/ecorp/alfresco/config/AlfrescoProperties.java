package com.ecorp.alfresco.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Configuration of the Alfresco server and credentials.
 *
 * <p>All values are read from the {@code alfresco.*} section of the
 * application configuration. No environment-specific defaults are kept in
 * Java code.</p>
 */
@ConfigurationProperties(prefix = "alfresco")
public class AlfrescoProperties {

    private String url;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
