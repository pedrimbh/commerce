package com.jpm.commerce.dto;

import com.jpm.commerce.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ProductDTO {
    private Long id;
    @NotBlank(message = "Campo requerido")
    @Size(min = 3,max = 100,message = ("Inserir de 3 a 100 caracteres"))
    private String name;
    @NotBlank
    @Size(min = 10, message = "Inserir uma descricao com mais de 10 caracteres")
    private String description;
    @Positive(message = "O preco deve ser positivo")
    private Double price;
    private String imgUrl;

    public ProductDTO(){}

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }
    public ProductDTO(Product entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.description = entity.getDescription();
        this.price = entity.getPrice();
        this.imgUrl = entity.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
