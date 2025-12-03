package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @GetMapping
    public String getAllRoles() {
        return "Get all roles";
    }

    @GetMapping("/{id}")
    public String getRoleById(@PathVariable Long id) {
        return "Get role by id: " + id;
    }

    @PostMapping
    public String createRole(@RequestBody String role) {
        return "Create role: " + role;
    }

    @PutMapping("/{id}")
    public String updateRole(@PathVariable Long id, @RequestBody String role) {
        return "Update role " + id + ": " + role;
    }

    @DeleteMapping("/{id}")
    public String deleteRole(@PathVariable Long id) {
        return "Delete role by id: " + id;
    }

    @PostMapping("/{roleId}/users/{userId}")
    public String assignRoleToUser(@PathVariable Long roleId, @PathVariable Long userId) {
        return "Assign role " + roleId + " to user " + userId;
    }

    @DeleteMapping("/{roleId}/users/{userId}")
    public String removeRoleFromUser(@PathVariable Long roleId, @PathVariable Long userId) {
        return "Remove role " + roleId + " from user " + userId;
    }
}