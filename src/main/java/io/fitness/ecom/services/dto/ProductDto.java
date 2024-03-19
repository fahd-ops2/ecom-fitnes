package io.fitness.ecom.services.dto;

import io.fitness.ecom.modals.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDto {
    private Long id;
    private String name;
    private String reference;
    private String description;
    private double price;
    private Category category;
}
