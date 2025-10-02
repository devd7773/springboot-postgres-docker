// File: src/main/java/com/example/demo/model/AppUser.java 
package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; // ⬅️ New Import

@Entity
@Table(name = "app_user") // ⬅️ FIX: Specify a non-reserved table name
public class AppUser { // ⬅️ Class Renamed

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public AppUser() {} // ⬅️ Constructor name updated

    public AppUser(String name) { this.name = name; } // ⬅️ Constructor name updated

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
