package com.web_based_vehicle_rental_system.service;

import com.web_based_vehicle_rental_system.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User registerUser(String username, String password, String email, String roleName);
}