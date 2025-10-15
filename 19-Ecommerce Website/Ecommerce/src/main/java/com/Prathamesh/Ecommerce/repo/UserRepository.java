package com.Prathamesh.Ecommerce.repo;

import com.Prathamesh.Ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
