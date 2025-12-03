package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

    @GetMapping("/{userId}")
    public String getProfile(@PathVariable Long userId) {
        return "Get profile for user: " + userId;
    }

    @PutMapping("/{userId}")
    public String updateProfile(@PathVariable Long userId, @RequestBody String profile) {
        return "Update profile for user " + userId + ": " + profile;
    }

    @PostMapping("/{userId}/avatar")
    public String uploadAvatar(@PathVariable Long userId, @RequestBody String avatar) {
        return "Upload avatar for user " + userId + ": " + avatar;
    }

    @GetMapping("/{userId}/settings")
    public String getProfileSettings(@PathVariable Long userId) {
        return "Get profile settings for user: " + userId;
    }

    @PutMapping("/{userId}/settings")
    public String updateProfileSettings(@PathVariable Long userId, @RequestBody String settings) {
        return "Update profile settings for user " + userId + ": " + settings;
    }
}