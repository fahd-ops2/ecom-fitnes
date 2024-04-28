package io.fitness.ecom.controller;

import io.fitness.ecom.service.ProductService;
import io.fitness.ecom.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


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

    @GetMapping("/byCategory")
    public Page<ProductDto> getProductsByCategory(@RequestParam(name = "page", defaultValue = "0") int page,
                                                  @RequestParam(name = "size", defaultValue = "10") int size,
                                                  @RequestParam("category") String category) {
        Pageable pageable = PageRequest.of(page, size);
        return productService.getProductsByCategory(pageable,category);
    }

    @GetMapping("/byProvider")
    public Page<ProductDto> getProductsByProvider(@RequestParam(name = "page", defaultValue = "0") int page,
                                                  @RequestParam(name = "size", defaultValue = "10") int size,
                                                  @RequestParam("provider") long provider) {
        Pageable pageable = PageRequest.of(page, size);
        return productService.findByProvider(pageable,provider);
    }

    @PostMapping("/create")
    public ProductDto createProduct(@RequestBody ProductDto productDto) {
        return productService.createProduct(productDto);
    }

}
