package com.ecorp.alfresco.config;

import com.ecorp.alfresco.api.*;
import com.ecorp.alfresco.exception.AlfrescoApiException;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.client.support.RestClientHttpServiceGroupConfigurer;
import org.springframework.web.service.registry.ImportHttpServices;

import java.nio.charset.StandardCharsets;
import java.util.Set;

/**
 * Spring Boot auto-configuration for Alfresco HTTP Service clients.
 *
 * <p>Each Alfresco API family is registered in its own HTTP Service group.
 * The actual server URL is configured once through {@code alfresco.url};
 * Spring Boot HTTP Service Client properties build the corresponding API
 * base URLs from that value.</p>
 */
@AutoConfiguration
@EnableConfigurationProperties(AlfrescoProperties.class)
@ImportHttpServices(
        group = "alfresco",
        types = {
                ActionsApi.class,
                ActivitiesApi.class,
                AuditApi.class,
                CascadingDictionariesApi.class,
                CategoriesApi.class,
                CommentsApi.class,
                DownloadsApi.class,
                FavoritesApi.class,
                GroupsApi.class,
                NetworksApi.class,
                NodesApi.class,
                PeopleApi.class,
                PreferencesApi.class,
                ProbesApi.class,
                QueriesApi.class,
                RatingsApi.class,
                RenditionsApi.class,
                SharedLinksApi.class,
                SitesApi.class,
                StorageInfoApi.class,
                TagsApi.class,
                TrashcanApi.class,
                VersionsApi.class
        })
@ImportHttpServices(group = "alfresco-auth", types = AuthenticationApi.class)
@ImportHttpServices(group = "alfresco-search", types = SearchApi.class)
@ImportHttpServices(group = "alfresco-discovery", types = DiscoveryApi.class)
public class AlfrescoAutoConfiguration {

    private static final Set<String> ALFRESCO_GROUPS = Set.of(
            "alfresco",
            "alfresco-auth",
            "alfresco-search",
            "alfresco-discovery"
    );

    @Bean
    RestClientHttpServiceGroupConfigurer alfrescoHttpServiceGroupConfigurer(
            AlfrescoProperties properties) {

        return groups -> groups.forEachClient((group, builder) -> {
            if (!ALFRESCO_GROUPS.contains(group.name())) {
                return;
            }

            builder.defaultHeaders(headers -> headers.setBasicAuth(
                    properties.getUsername(),
                    properties.getPassword(),
                    StandardCharsets.UTF_8
            ));

            builder.defaultStatusHandler(
                    HttpStatusCode::isError,
                    (request, response) -> {
                        String body = new String(
                                response.getBody().readAllBytes(),
                                StandardCharsets.UTF_8
                        );
                        throw new AlfrescoApiException(
                                response.getStatusCode(),
                                body
                        );
                    }
            );
        });
    }
}
