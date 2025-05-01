package com.jpm.commerce.controllers;

import com.jpm.commerce.dto.ProductDTO;
import com.jpm.commerce.entities.Product;
import com.jpm.commerce.repositories.ProductRepository;
import com.jpm.commerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id){
        return service.findById(id);
    }
}
