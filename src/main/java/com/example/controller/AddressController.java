package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @GetMapping("/users/{userId}")
    public String getAddressesByUserId(@PathVariable Long userId) {
        return "Get addresses for user: " + userId;
    }

    @GetMapping("/{id}")
    public String getAddressById(@PathVariable Long id) {
        return "Get address by id: " + id;
    }

    @PostMapping("/users/{userId}")
    public String createAddress(@PathVariable Long userId, @RequestBody String address) {
        return "Create address for user " + userId + ": " + address;
    }

    @PutMapping("/{id}")
    public String updateAddress(@PathVariable Long id, @RequestBody String address) {
        return "Update address " + id + ": " + address;
    }

    @DeleteMapping("/{id}")
    public String deleteAddress(@PathVariable Long id) {
        return "Delete address by id: " + id;
    }

    @PutMapping("/{id}/default")
    public String setDefaultAddress(@PathVariable Long id) {
        return "Set default address: " + id;
    }
}