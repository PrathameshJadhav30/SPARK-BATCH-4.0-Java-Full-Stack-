package com.Prathamesh.Ecommerce.repo;

import com.Prathamesh.Ecommerce.model.Product;
import com.Prathamesh.Ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
