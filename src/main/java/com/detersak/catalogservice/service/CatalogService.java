package com.detersak.catalogservice.service;

import com.detersak.catalogservice.entity.Catalog;
import com.detersak.catalogservice.repository.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {
    private final CatalogRepository catalogRepository;
    @Autowired
    public CatalogService(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    public List<Catalog> getAllCatalogs() {
        return catalogRepository.findAll();
    }
    // Em VehicleService
    public Catalog getCatalogById(Long id) {
        return catalogRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Veículo com ID " + id + " não encontrado!"));
    }

}

