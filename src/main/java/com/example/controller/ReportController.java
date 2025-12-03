package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reports")
public class ReportController {

    @GetMapping("/users/{userId}")
    public String getUserReports(@PathVariable Long userId) {
        return "Get reports for user: " + userId;
    }

    @GetMapping("/{id}")
    public String getReportById(@PathVariable Long id) {
        return "Get report by id: " + id;
    }

    @PostMapping
    public String createReport(@RequestBody String report) {
        return "Create report: " + report;
    }

    @PutMapping("/{id}/status")
    public String updateReportStatus(@PathVariable Long id, @RequestBody String status) {
        return "Update status for report " + id + ": " + status;
    }

    @GetMapping("/recent")
    public String getRecentReports() {
        return "Get recent reports";
    }

    @GetMapping("/stats")
    public String getReportStats() {
        return "Get report statistics";
    }

    @DeleteMapping("/{id}")
    public String deleteReport(@PathVariable Long id) {
        return "Delete report by id: " + id;
    }
}