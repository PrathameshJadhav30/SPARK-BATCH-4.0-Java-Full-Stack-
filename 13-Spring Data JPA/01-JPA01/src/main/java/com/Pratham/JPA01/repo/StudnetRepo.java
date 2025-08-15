package com.Pratham.JPA01.repo;

import com.Pratham.JPA01.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudnetRepo extends JpaRepository<Student,Long> {
}
