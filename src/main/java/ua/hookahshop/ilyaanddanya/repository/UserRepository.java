package ua.hookahshop.ilyaanddanya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;
import ua.hookahshop.ilyaanddanya.entity.User;

@RestController
public interface UserRepository extends JpaRepository<User, Long> {
}
