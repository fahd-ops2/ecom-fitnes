package io.fitness.ecom.mapper;

import io.fitness.ecom.entity.Category;
import io.fitness.ecom.dto.CategoryDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    public CategoryDto categoryToCategoryDto(Category category);

    public Category categoryDtoToCategory(CategoryDto categoryDto);

    public List<CategoryDto> categoriesToCategoryDtos(List<Category> categories);

    public List<Category> categoryDtosToCategories(List<CategoryDto> categoryDtos);
}
