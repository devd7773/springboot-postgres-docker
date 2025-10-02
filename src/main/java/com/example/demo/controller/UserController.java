// File: src/main/java/com/example/demo/controller/UserController.java
package com.example.demo.controller;

import com.example.demo.model.AppUser; // ⬅️ Import the new entity class
import com.example.demo.repository.UserRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<AppUser> getUsers() { // ⬅️ Use AppUser
        return userRepository.findAll();
    }

    @PostMapping
    public AppUser addUser(@RequestBody AppUser user) { // ⬅️ Use AppUser
        return userRepository.save(user);
    }
}
