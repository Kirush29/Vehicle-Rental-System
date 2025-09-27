package com.web_based_vehicle_rental_system.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "login"; // your login.html
    }

    @GetMapping("/default")
    public String defaultAfterLogin(Authentication authentication) {
        // Get the role of the logged-in user
        for (GrantedAuthority authority : authentication.getAuthorities()) {
            String role = authority.getAuthority();

            switch (role) {
                case "ROLE_SHOP_MANAGER":
                    return "redirect:/dashboard/shopmanager";
                case "ROLE_MARKETING":
                    return "redirect:/dashboard/marketing";
                case "ROLE_DELIVERY":
                    return "redirect:/dashboard/delivery";
                case "ROLE_FINANCE":
                    return "redirect:/dashboard/finance";
                case "ROLE_ADMIN":
                    return "redirect:/dashboard/admin";
                case "ROLE_CUSTOMER":
                    return "redirect:/dashboard/customer";
                default:
                    return "redirect:/access-denied";
            }
        }
        return "redirect:/access-denied";
    }

    @GetMapping("/access-denied")
    public String accessDenied() {
        return "access-denied"; // make a simple access-denied.html page
    }
}
