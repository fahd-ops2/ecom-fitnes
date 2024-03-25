package io.fitness.ecom.services;

import io.fitness.ecom.dao.CategoryRepository;
import io.fitness.ecom.modals.Category;
import io.fitness.ecom.services.dto.CategoryDto;
import io.fitness.ecom.services.mappers.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;
    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<CategoryDto> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        return CategoryMapper.INSTANCE.categoriesToCategoryDtos(categories);
    }
}
