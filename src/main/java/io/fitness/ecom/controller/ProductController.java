package io.fitness.ecom.controller;

import io.fitness.ecom.service.impl.ProductServiceImpl;
import io.fitness.ecom.dto.ProductDto;
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

    private final ProductServiceImpl productService;

    @Autowired
    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public Page<ProductDto> getAllProducts(@RequestParam("page") int page,
                                           @RequestParam("size") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return productService.getAllProducts(pageable);
    }

    @GetMapping("/byCategory")
    public Page<ProductDto> getProductsByCategory(@RequestParam("page") int page,
                                                  @RequestParam("size") int size,
                                                  @RequestParam("category") String category) {
        Pageable pageable = PageRequest.of(page, size);
        return productService.getProductsByCategory(pageable,category);
    }

}
