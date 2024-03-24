package io.fitness.ecom.services;

import io.fitness.ecom.dao.ProductRepository;
import io.fitness.ecom.modals.Product;
import io.fitness.ecom.services.dto.ProductDto;
import io.fitness.ecom.services.mappers.ProductMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Page<ProductDto> getAllProducts(Pageable pageable) {
        Page page = productRepository.findAll(pageable);
        List<ProductDto> products = ProductMapper.INSTANCE.productsToProductDtos(page.getContent());
        return new PageImpl<>(products, page.getPageable(), page.getTotalElements());
    }
}
