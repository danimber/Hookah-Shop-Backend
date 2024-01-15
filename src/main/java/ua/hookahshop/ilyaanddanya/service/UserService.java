package ua.hookahshop.ilyaanddanya.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.hookahshop.ilyaanddanya.dto.ProductDTO;
import ua.hookahshop.ilyaanddanya.dto.UserDTO;
import ua.hookahshop.ilyaanddanya.entity.Product;
import ua.hookahshop.ilyaanddanya.entity.User;
import ua.hookahshop.ilyaanddanya.repository.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User create(UserDTO dto) {
        User user = User.builder()
                .userName(dto.getUserName())
                .password(dto.getPassword())
                .build();
        return userRepository.save(user);
    }

    public List<User> readAll() {
        return userRepository.findAll();
    }

    public User update(Long id, User user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
