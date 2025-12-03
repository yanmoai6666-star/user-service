package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getAllUsers() {
        return "Get all users";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable Long id) {
        return "Get user by id: " + id;
    }

    @PostMapping
    public String createUser(@RequestBody String user) {
        return "Create user: " + user;
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody String user) {
        return "Update user " + id + ": " + user;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        return "Delete user by id: " + id;
    }
}