package ua.hookahshop.ilyaanddanya.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.hookahshop.ilyaanddanya.dto.UserDTO;
import ua.hookahshop.ilyaanddanya.entity.User;
import ua.hookahshop.ilyaanddanya.service.UserService;

import java.util.List;

@CrossOrigin
@RestController
@AllArgsConstructor
public class UserRestController {

    private final UserService userService;

    @PostMapping("/api/user/createUser")
    public ResponseEntity<List<User>> createAndReadAll(@RequestBody UserDTO dto) {
        userService.create(dto);
        List<User> updateUsers = userService.readAll();
        return new ResponseEntity<>(updateUsers, HttpStatus.OK);
    }

    @GetMapping("/api/user/readAllUsers")
    public ResponseEntity<List<User>> readAll() {
        return new ResponseEntity<>(userService.readAll(), HttpStatus.OK);
    }

    @PutMapping("/api/user/updateUser/{id}")
    public ResponseEntity<List<User>> update(@PathVariable Long id, @RequestBody User user) {
        userService.update(id, user);
        List<User> updateUsers = userService.readAll();
        return new ResponseEntity<>(updateUsers, HttpStatus.OK);
    }

    @DeleteMapping("/api/user/deleteById/{id}")
    public ResponseEntity<List<User>> delete(@PathVariable Long id) {
        userService.delete(id);
        List<User> updatedUsers = userService.readAll();
        return new ResponseEntity<>(updatedUsers, HttpStatus.OK);
    }
}
