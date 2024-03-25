package io.fitness.ecom.mapper;

import io.fitness.ecom.entity.Product;
import io.fitness.ecom.dto.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDto productToProductDto(Product product);

    Product productDtoToProduct(ProductDto productDto);

    List<ProductDto> productsToProductDtos(List<Product> products);

    List<Product> productDtosToProducts(List<ProductDto> productDtos);
}
