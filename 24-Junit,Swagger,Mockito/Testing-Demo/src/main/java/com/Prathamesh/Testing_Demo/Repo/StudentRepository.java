package com.Prathamesh.Testing_Demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Prathamesh.Testing_Demo.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
