package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @GetMapping("/users/{userId}")
    public String getNotificationsByUserId(@PathVariable Long userId) {
        return "Get notifications for user: " + userId;
    }

    @GetMapping("/{id}")
    public String getNotificationById(@PathVariable Long id) {
        return "Get notification by id: " + id;
    }

    @PostMapping
    public String createNotification(@RequestBody String notification) {
        return "Create notification: " + notification;
    }

    @PutMapping("/{id}/read")
    public String markAsRead(@PathVariable Long id) {
        return "Mark notification " + id + " as read";
    }

    @PutMapping("/users/{userId}/read-all")
    public String markAllAsRead(@PathVariable Long userId) {
        return "Mark all notifications as read for user: " + userId;
    }

    @DeleteMapping("/{id}")
    public String deleteNotification(@PathVariable Long id) {
        return "Delete notification by id: " + id;
    }

    @DeleteMapping("/users/{userId}")
    public String deleteAllNotifications(@PathVariable Long userId) {
        return "Delete all notifications for user: " + userId;
    }
}