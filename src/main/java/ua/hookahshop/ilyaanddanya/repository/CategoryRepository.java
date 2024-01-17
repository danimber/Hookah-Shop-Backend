package ua.hookahshop.ilyaanddanya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.hookahshop.ilyaanddanya.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
