package com.ecorp.alfresco.api;

import com.ecorp.alfresco.dto.core.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

public interface FavoritesApi {

    @GetExchange(url = "/people/{personId}/favorite-sites")
    SitePaging listFavoriteSitesForPerson(@PathVariable("personId") String personId, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "fields", required = false) List<String> fields);

    @PostExchange(url = "/people/{personId}/favorite-sites")
    FavoriteSiteEntry createSiteFavorite(@PathVariable("personId") String personId, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody FavoriteSiteBodyCreate favoriteSiteBodyCreate);

    @GetExchange(url = "/people/{personId}/favorite-sites/{siteId}")
    SiteEntry getFavoriteSite(@PathVariable("personId") String personId, @PathVariable("siteId") String siteId, @RequestParam(value = "fields", required = false) List<String> fields);

    @DeleteExchange(url = "/people/{personId}/favorite-sites/{siteId}")
    Void deleteSiteFavorite(@PathVariable("personId") String personId, @PathVariable("siteId") String siteId);

    @GetExchange(url = "/people/{personId}/favorites")
    FavoritePaging listFavorites(@PathVariable("personId") String personId, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "orderBy", required = false) List<String> orderBy, @RequestParam(value = "where", required = false) String where, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields);

    @PostExchange(url = "/people/{personId}/favorites")
    FavoriteEntry createFavorite(@PathVariable("personId") String personId, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody FavoriteBodyCreate favoriteBodyCreate);

    @GetExchange(url = "/people/{personId}/favorites/{favoriteId}")
    FavoriteEntry getFavorite(@PathVariable("personId") String personId, @PathVariable("favoriteId") String favoriteId, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields);

    @DeleteExchange(url = "/people/{personId}/favorites/{favoriteId}")
    Void deleteFavorite(@PathVariable("personId") String personId, @PathVariable("favoriteId") String favoriteId);
}
