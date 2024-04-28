package io.fitness.ecom.service;

import io.fitness.ecom.dto.ProductDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {

    Page<ProductDto> getAllProducts(Pageable pageable);

    Page<ProductDto> getProductsByCategory(Pageable pageable, String category);

    Page<ProductDto> findByProvider(Pageable pageable, long provider);

    ProductDto createProduct(ProductDto productDto);

    ProductDto updateProduct(ProductDto productDto, long id);

    void deleteProduct(long id);

    }
