package com.detersak.catalogservice.controller;

import com.detersak.catalogservice.entity.Catalog;
import com.detersak.catalogservice.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {
    private CatalogService catalogService;

    @Autowired
    CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping()
    public @ResponseBody List<Catalog> getAllCatalogs() {
        return catalogService.getAllCatalogs();
    }
    @GetMapping("/{id}")
    public @ResponseBody Catalog getCatalogById(@PathVariable Long id) {
        return catalogService.getCatalogById(id);
    }


}
