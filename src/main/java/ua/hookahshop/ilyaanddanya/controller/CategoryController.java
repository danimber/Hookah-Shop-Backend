package ua.hookahshop.ilyaanddanya.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.hookahshop.ilyaanddanya.dto.CategoryDTO;
import ua.hookahshop.ilyaanddanya.entity.Category;
import ua.hookahshop.ilyaanddanya.service.CategoryService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/categories/api")
@AllArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/readAllCategories")
    public ResponseEntity<List<Category>> readAllCategories() {
        return new ResponseEntity<>(categoryService.readAllCategories(), HttpStatus.OK);
    }

    @PostMapping("/createCategory")
    public ResponseEntity<Category> createCategory(@RequestBody CategoryDTO dto) {
        return new ResponseEntity<>(categoryService.create(dto), HttpStatus.OK);
    }

    @DeleteMapping("/deleteCategory/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.delete(id);
    }
}
