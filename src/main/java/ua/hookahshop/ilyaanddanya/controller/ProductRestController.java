package ua.hookahshop.ilyaanddanya.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.hookahshop.ilyaanddanya.dto.ProductDTO;
import ua.hookahshop.ilyaanddanya.entity.Product;
import ua.hookahshop.ilyaanddanya.service.ProductService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/products/api")
@AllArgsConstructor
public class ProductRestController {

    private final ProductService productService;

    @PostMapping("/createProduct")
    public ResponseEntity<List<Product>> createAndReadAll(@RequestBody ProductDTO dto) {
        productService.create(dto);
        List<Product> updatedProducts = productService.readAll();
        return new ResponseEntity<>(updatedProducts, HttpStatus.OK);
    }

    @GetMapping("/readAllProducts")
    public ResponseEntity<List<Product>> readAll() {
        return mappingResponseListProducts(productService.readAll());
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<List<Product>> readProductsByCategoryId(@PathVariable Long id) {
        return mappingResponseListProducts(productService.readProductsByCategoryId(id));
    }

    @PutMapping("/updateProduct/{id}")
    public ResponseEntity<List<Product>> update(@PathVariable Long id, @RequestBody Product product) {
        productService.update(id, product);
        List<Product> updatedProducts = productService.readAll();
        return mappingResponseListProducts(updatedProducts);
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<List<Product>> delete(@PathVariable Long id) {
        productService.delete(id);
        List<Product> updatedProducts = productService.readAll();
        return new ResponseEntity<>(updatedProducts, HttpStatus.OK);
    }

    private ResponseEntity<List<Product>> mappingResponseListProducts(List<Product> products) {
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
