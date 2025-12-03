package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/permissions")
public class PermissionController {

    @GetMapping
    public String getAllPermissions() {
        return "Get all permissions";
    }

    @GetMapping("/{id}")
    public String getPermissionById(@PathVariable Long id) {
        return "Get permission by id: " + id;
    }

    @PostMapping
    public String createPermission(@RequestBody String permission) {
        return "Create permission: " + permission;
    }

    @PutMapping("/{id}")
    public String updatePermission(@PathVariable Long id, @RequestBody String permission) {
        return "Update permission " + id + ": " + permission;
    }

    @DeleteMapping("/{id}")
    public String deletePermission(@PathVariable Long id) {
        return "Delete permission by id: " + id;
    }

    @PostMapping("/{permissionId}/roles/{roleId}")
    public String assignPermissionToRole(@PathVariable Long permissionId, @PathVariable Long roleId) {
        return "Assign permission " + permissionId + " to role " + roleId;
    }

    @DeleteMapping("/{permissionId}/roles/{roleId}")
    public String removePermissionFromRole(@PathVariable Long permissionId, @PathVariable Long roleId) {
        return "Remove permission " + permissionId + " from role " + roleId;
    }
}