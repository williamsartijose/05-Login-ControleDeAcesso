package com.wsjsistema.wsjdscommerce.dto;

import com.wsjsistema.wsjdscommerce.entities.Product;
import javax.persistence.Column;
import javax.validation.constraints.*;

public class ProductDTO {

    private Long id;
    @Size(min = 3, max = 80, message = "Nome precisa ter de 3 a 80 caracteres")
    @NotBlank(message = "Campo requerido")
    private String name;
    @Size(min = 10, message = "Descrição precisa ter no minimo 10 caracteres")
    @NotBlank(message = "Campo requerido")
    private String description;
    @Positive(message =  "O preço deve ser positivo")
    private Double price;
    private String imgUrl;

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }
    public ProductDTO(Product entitiy) {
        id = entitiy.getId();
        name = entitiy.getName();
        description = entitiy.getDescription();
        price = entitiy.getPrice();
        imgUrl = entitiy.getImgUrl();
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