package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/activities")
public class ActivityController {

    @GetMapping("/users/{userId}")
    public String getActivitiesByUserId(@PathVariable Long userId) {
        return "Get activities for user: " + userId;
    }

    @GetMapping("/{id}")
    public String getActivityById(@PathVariable Long id) {
        return "Get activity by id: " + id;
    }

    @PostMapping
    public String createActivity(@RequestBody String activity) {
        return "Create activity: " + activity;
    }

    @GetMapping("/recent")
    public String getRecentActivities() {
        return "Get recent activities";
    }

    @DeleteMapping("/{id}")
    public String deleteActivity(@PathVariable Long id) {
        return "Delete activity by id: " + id;
    }

    @DeleteMapping("/users/{userId}")
    public String deleteAllActivities(@PathVariable Long userId) {
        return "Delete all activities for user: " + userId;
    }
}