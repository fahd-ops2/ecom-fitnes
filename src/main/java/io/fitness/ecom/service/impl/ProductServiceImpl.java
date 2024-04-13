package io.fitness.ecom.service.impl;

import io.fitness.ecom.repository.ProductRepository;
import io.fitness.ecom.entity.Product;
import io.fitness.ecom.dto.ProductDto;
import io.fitness.ecom.mapper.ProductMapper;
import io.fitness.ecom.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Page<ProductDto> getAllProducts(Pageable pageable) {
        Page page = productRepository.findAll(pageable);
        List<ProductDto> products = ProductMapper.INSTANCE.productsToProductDtos(page.getContent());
        return new PageImpl<>(products, page.getPageable(), page.getTotalElements());
    }

    public Page<ProductDto> getProductsByCategory(Pageable pageable, String category) {
        Page<Product> productsByCategory = productRepository.findByCategory(pageable, category);
        List<ProductDto> products = ProductMapper.INSTANCE.productsToProductDtos(productsByCategory.getContent());
        return new PageImpl<>(products, productsByCategory.getPageable(), productsByCategory.getTotalElements());
    }

    @Override
    public Page<ProductDto> findByProvider(Pageable pageable, long provider) {
        List<ProductDto> products = ProductMapper.INSTANCE.productsToProductDtos(productRepository.findByProvider(pageable, provider).getContent());
        return new PageImpl<>(products, pageable, products.size());
    }
}
