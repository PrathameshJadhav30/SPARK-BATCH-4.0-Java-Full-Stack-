package com.Pratham.JPA02.repo;

import com.Pratham.JPA02.entity.Laptop;
import com.Pratham.JPA02.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepo extends JpaRepository<Laptop,Long> {
}
