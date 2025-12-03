package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/settings")
public class SettingsController {

    @GetMapping("/users/{userId}")
    public String getUserSettings(@PathVariable Long userId) {
        return "Get settings for user: " + userId;
    }

    @PutMapping("/users/{userId}")
    public String updateUserSettings(@PathVariable Long userId, @RequestBody String settings) {
        return "Update settings for user " + userId + ": " + settings;
    }

    @GetMapping("/system")
    public String getSystemSettings() {
        return "Get system settings";
    }

    @PutMapping("/system")
    public String updateSystemSettings(@RequestBody String settings) {
        return "Update system settings: " + settings;
    }

    @GetMapping("/notifications/users/{userId}")
    public String getNotificationSettings(@PathVariable Long userId) {
        return "Get notification settings for user: " + userId;
    }

    @PutMapping("/notifications/users/{userId}")
    public String updateNotificationSettings(@PathVariable Long userId, @RequestBody String settings) {
        return "Update notification settings for user " + userId + ": " + settings;
    }
}