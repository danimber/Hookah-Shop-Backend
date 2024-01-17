package ua.hookahshop.ilyaanddanya.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.hookahshop.ilyaanddanya.dto.CategoryDTO;
import ua.hookahshop.ilyaanddanya.dto.ProductDTO;
import ua.hookahshop.ilyaanddanya.entity.Category;
import ua.hookahshop.ilyaanddanya.entity.Product;
import ua.hookahshop.ilyaanddanya.repository.CategoryRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {

    public final CategoryRepository categoryRepository;

    public List<Category> readAllCategories() {
        return categoryRepository.findAll();
    }

    public Category readCategoryById(Long id) {
        return categoryRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Category not found - " + id));
    }

    public Category create(CategoryDTO dto) {
        return categoryRepository.save(Category.builder()
                .name(dto.getName())
                .build());
    }

    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }
}
