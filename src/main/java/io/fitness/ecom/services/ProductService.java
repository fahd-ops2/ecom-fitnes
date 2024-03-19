package io.fitness.ecom.services;

import io.fitness.ecom.dao.ProductRepository;
import io.fitness.ecom.modals.Product;
import io.fitness.ecom.services.dto.ProductDto;
import io.fitness.ecom.services.mappers.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDto> getAllProducts() {
        return ProductMapper.INSTANCE.productsToProductDtos(productRepository.findAll());
    }
}
