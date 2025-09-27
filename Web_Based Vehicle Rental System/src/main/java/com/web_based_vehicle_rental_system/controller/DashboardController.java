package com.web_based_vehicle_rental_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/dashboard/shopmanager")
    public String shopManagerDashboard() {
        return "dashboard_shop_manager";
    }

    @GetMapping("/dashboard/marketing")
    public String marketingDashboard() {
        return "dashboard_marketing";
    }

    @GetMapping("/dashboard/delivery")
    public String deliveryDashboard() {
        return "dashboard_delivery";
    }

    @GetMapping("/dashboard/finance")
    public String financeDashboard() {
        return "dashboard_finance";
    }

    @GetMapping("/dashboard/admin")
    public String adminDashboard() {
        return "dashboard_admin";
    }

    @GetMapping("/dashboard/customer")
    public String customerDashboard() {
        return "dashboard_customer";
    }
}
