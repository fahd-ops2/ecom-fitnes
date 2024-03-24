package io.fitness.ecom;

import io.fitness.ecom.dao.ProductRepository;
import io.fitness.ecom.modals.Product;
import io.fitness.ecom.services.ProductService;
import io.fitness.ecom.services.dto.ProductDto;
import io.fitness.ecom.services.mappers.ProductMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @Mock
    private ProductMapper productMapper;

    @Test
    public void testGetProductsByCategory() {
        Pageable pageable = PageRequest.of(0, 5);
        String category = "Electronics";

        List<Product> dummyProducts = Arrays.asList(
                Product.builder().name("Laptop").price(1200).reference("LT1001").build()
                /*Product.builder().name("T-shirt").price(25).build(),
                Product.builder().name("Programing Book").price(35).build(),
                Product.builder().name("Sofa").price(500).build(),
                Product.builder().name("Action Figure").price(15).build()*/
        );
        Page<Product> dummyPage = new PageImpl<>(dummyProducts);
        when(productRepository.findByCategory(pageable, category)).thenReturn(dummyPage);

        List<ProductDto> dummyProductDTOs = Arrays.asList(
                ProductDto.builder().name("Laptop").price(1200).build(),
                ProductDto.builder().name("T-shirt").price(25).build(),
                ProductDto.builder().name("Programing Book").price(35).build(),
                ProductDto.builder().name("Sofa").price(500).build(),
                ProductDto.builder().name("Action Figure").price(15).build()
        );
        when(productMapper.productsToProductDtos(dummyPage.getContent())).thenReturn(dummyProductDTOs);

        ProductService productService = new ProductService(productRepository);
        Page<ProductDto> result = productService.getProductsByCategory(pageable, category);

        assertEquals(dummyProductDTOs, result.getContent());
    }
}
