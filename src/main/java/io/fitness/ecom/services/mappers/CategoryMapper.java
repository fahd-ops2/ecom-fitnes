package io.fitness.ecom.services.mappers;

import io.fitness.ecom.modals.Category;
import io.fitness.ecom.services.dto.CategoryDto;
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
