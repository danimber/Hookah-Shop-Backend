package ua.hookahshop.ilyaanddanya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.hookahshop.ilyaanddanya.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
