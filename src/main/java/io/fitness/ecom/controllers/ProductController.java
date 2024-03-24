package io.fitness.ecom.controllers;

import io.fitness.ecom.modals.Product;
import io.fitness.ecom.services.ProductService;
import io.fitness.ecom.services.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public Page<ProductDto> getAllProducts(@RequestParam("page") int page,
                                           @RequestParam("size") int size) {

        Pageable pageable = PageRequest.of(page, size);
        return productService.getAllProducts(pageable);
    }
}
