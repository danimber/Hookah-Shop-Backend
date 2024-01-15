package ua.hookahshop.ilyaanddanya.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.hookahshop.ilyaanddanya.dto.ProductDTO;
import ua.hookahshop.ilyaanddanya.entity.Product;
import ua.hookahshop.ilyaanddanya.repository.ProductRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository  productRepository;

    public Product create(ProductDTO dto) {
        Product product = Product.builder()
                .name(dto.getName())
                .amount(dto.getAmount())
                .build();
        return productRepository.save(product);
    }

    public List<Product> readAll() {
        return productRepository.findAll();
    }

    public Product update(Long id, Product product) {
        return productRepository.save(product);
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
