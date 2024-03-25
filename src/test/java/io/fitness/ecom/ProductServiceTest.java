package io.fitness.ecom;

import io.fitness.ecom.repository.ProductRepository;
import io.fitness.ecom.entity.Product;
import io.fitness.ecom.service.impl.ProductServiceImpl;
import io.fitness.ecom.dto.ProductDto;
import io.fitness.ecom.mapper.ProductMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.Collections;
import java.util.List;

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

        List<Product> dummyProducts = Collections.singletonList(
                Product.builder().name("Laptop").price(1200).reference("LT1001").build()
                /*Product.builder().name("T-shirt").price(25).build(),
                Product.builder().name("Programing Book").price(35).build(),
                Product.builder().name("Sofa").price(500).build(),
                Product.builder().name("Action Figure").price(15).build()*/
        );
        Page<Product> dummyPage = new PageImpl<>(dummyProducts);
        when(productRepository.findByCategory(pageable, category)).thenReturn(dummyPage);

        List<ProductDto> dummyProductDTOs = Collections.singletonList(
                ProductDto.builder().name("Laptop").price(1200).reference("LT1001").build()
         /*       ProductDto.builder().name("T-shirt").price(25).build(),
                ProductDto.builder().name("Programing Book").price(35).build(),
                ProductDto.builder().name("Sofa").price(500).build(),
                ProductDto.builder().name("Action Figure").price(15).build()*/
        );
        //when(productMapper.productsToProductDtos(dummyPage.getContent())).thenReturn(dummyProductDTOs);

        ProductServiceImpl productService = new ProductServiceImpl(productRepository);
        Page<ProductDto> result = productService.getProductsByCategory(pageable, category);

        assertThat(result.getContent()).hasSize(1);
    }
}
