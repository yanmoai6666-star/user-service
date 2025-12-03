package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody String credentials) {
        return "Login with credentials: " + credentials;
    }

    @PostMapping("/logout")
    public String logout() {
        return "Logout successful";
    }

    @PostMapping("/register")
    public String register(@RequestBody String user) {
        return "Register new user: " + user;
    }

    @PostMapping("/refresh")
    public String refreshToken(@RequestBody String token) {
        return "Refresh token: " + token;
    }

    @PostMapping("/forgot-password")
    public String forgotPassword(@RequestBody String email) {
        return "Forgot password for email: " + email;
    }
}