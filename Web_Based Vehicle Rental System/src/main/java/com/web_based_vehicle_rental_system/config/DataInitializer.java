package com.web_based_vehicle_rental_system.config;

import com.web_based_vehicle_rental_system.model.Role;
import com.web_based_vehicle_rental_system.model.User;
import com.web_based_vehicle_rental_system.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initData(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            if (userRepository.findByUsername("shopmanager") == null) {
                User sm = new User();
                sm.setUsername("shopmanager");
                sm.setPassword(passwordEncoder.encode("shop123"));
                sm.setEmail("shopmanager@system.com");

                Role smRole = new Role();
                smRole.setName("SHOP_MANAGER");
                sm.setRole(smRole);

                userRepository.save(sm);
            }

            // ✅ repeat for marketing, delivery, finance, admin...
        };
    }
}
