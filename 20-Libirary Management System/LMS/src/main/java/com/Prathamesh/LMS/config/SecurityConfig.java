package com.Prathamesh.LMS.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity // Enable Spring Security integration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                // 1. Disable CSRF (Cross-Site Request Forgery) for API development/testing
                .csrf(csrf -> csrf.disable())

                // 2. Authorize all requests
                .authorizeHttpRequests(authorize -> authorize
                        .anyRequest().permitAll() // Allow ALL requests to ALL endpoints
                );

        // 3. (Optional but often useful for APIs) Disable HTTP Basic/Form Login
        // If you had login previously, this prevents Spring from adding the default login form.
        http.httpBasic(basic -> basic.disable());
        http.formLogin(form -> form.disable());

        return http.build();
    }
}