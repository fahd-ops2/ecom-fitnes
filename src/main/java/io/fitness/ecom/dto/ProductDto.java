package io.fitness.ecom.dto;

import io.fitness.ecom.entity.Category;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductDto {
    private Long id;
    private String name;
    private String reference;
    private String description;
    private double price;
    private Category category;
}
