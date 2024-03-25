package io.fitness.ecom.service;

import io.fitness.ecom.dto.ProductDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {

    Page<ProductDto> getAllProducts(Pageable pageable);

    Page<ProductDto> getProductsByCategory(Pageable pageable, String category);


    }
