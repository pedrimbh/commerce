package com.jpm.commerce.services;

import com.jpm.commerce.dto.ProductDTO;
import com.jpm.commerce.entities.Product;
import com.jpm.commerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        //Optional<Product> result= repository.findById(id);
        Product product = repository.findById(id).get();
       // ProductDTO dto = new ProductDTO(product.getId(), product.getName(), product.getDescription(), product.getPrice(), product.getImgUrl());
        return new ProductDTO(product);
    }
}
