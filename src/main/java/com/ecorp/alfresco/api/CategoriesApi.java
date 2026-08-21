package com.ecorp.alfresco.api;

import com.ecorp.alfresco.dto.core.CategoryBody;
import com.ecorp.alfresco.dto.core.CategoryEntry;
import com.ecorp.alfresco.dto.core.CategoryLinkBody;
import com.ecorp.alfresco.dto.core.CategoryPaging;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

import java.util.List;

public interface CategoriesApi {

    @GetExchange(url = "/nodes/{nodeId}/category-links")
    CategoryPaging listCategoriesForNode(@PathVariable("nodeId") String nodeId, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields);

    @PostExchange(url = "/nodes/{nodeId}/category-links")
    CategoryEntry createCategoryLinkForNode(@PathVariable("nodeId") String nodeId, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody CategoryLinkBody categoryLinkBodyCreate);

    @DeleteExchange(url = "/nodes/{nodeId}/category-links/{categoryId}")
    Void deleteCategoryLinkFromNode(@PathVariable("nodeId") String nodeId, @PathVariable("categoryId") String categoryId);

    @GetExchange(url = "/categories/{categoryId}")
    CategoryEntry getCategory(@PathVariable("categoryId") String categoryId, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields);

    @PutExchange(url = "/categories/{categoryId}")
    CategoryEntry updateCategory(@PathVariable("categoryId") String categoryId, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody CategoryBody categoryBodyUpdate);

    @DeleteExchange(url = "/categories/{categoryId}")
    Void deleteCategory(@PathVariable("categoryId") String categoryId);

    @GetExchange(url = "/categories/{categoryId}/subcategories")
    CategoryPaging listSubcategories(@PathVariable("categoryId") String categoryId, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "skipCount", required = false) Integer skipCount, @RequestParam(value = "maxItems", required = false) Integer maxItems, @RequestParam(value = "fields", required = false) List<String> fields);

    @PostExchange(url = "/categories/{categoryId}/subcategories")
    CategoryEntry createCategory(@PathVariable("categoryId") String categoryId, @RequestParam(value = "include", required = false) List<String> include, @RequestParam(value = "fields", required = false) List<String> fields, @RequestBody CategoryBody categoryBodyCreate);
}
