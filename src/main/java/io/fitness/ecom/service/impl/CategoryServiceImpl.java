package io.fitness.ecom.service.impl;

import io.fitness.ecom.repository.CategoryRepository;
import io.fitness.ecom.entity.Category;
import io.fitness.ecom.dto.CategoryDto;
import io.fitness.ecom.mapper.CategoryMapper;
import io.fitness.ecom.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<CategoryDto> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        return CategoryMapper.INSTANCE.categoriesToCategoryDtos(categories);
    }
}
