package com.web_based_vehicle_rental_system.repository;

import com.web_based_vehicle_rental_system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}