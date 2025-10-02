// File: src/main/java/com/example/demo/repository/UserRepository.java
package com.example.demo.repository;

import com.example.demo.model.AppUser; // ⬅️ Import the new entity class
import org.springframework.data.jpa.repository.JpaRepository;

// Use AppUser as the generic type
public interface UserRepository extends JpaRepository<AppUser, Long> {
}
