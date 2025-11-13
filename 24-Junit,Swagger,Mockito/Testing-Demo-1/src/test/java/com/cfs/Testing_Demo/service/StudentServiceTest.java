package com.cfs.Testing_Demo.service;

import com.cfs.Testing_Demo.entity.Student;
import com.cfs.Testing_Demo.repo.StudentRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudentServiceTest {

    @Autowired
    private StudentRepository repo;

    @Autowired
    private StudentService service;

    @BeforeEach
    void setup()
    {
        repo.deleteAll();
    }



    @Test
    @Order(1)
    void shouldAddStudentSuccessfully()
    {
        Student s= new Student(null,"kalu","kalu@gami.com",24);
        Student saved=service.addStudent(s);

        assertNotNull(saved.getId());
        assertEquals("kalu",saved.getName());
    }

    @Test
    @Order(2)
    void shouldFetchStudents()
    {
        Student s= new Student(null,"Abhay","abhay@gami.com",24);
        Student s1= new Student(null,"Kajal","kajal@gami.com",22);
        service.addStudent(s);
        service.addStudent(s1);

        List<Student> list=service.getAll();
        assertEquals(2,list.size());
    }

    @Test
    @Order(3)
    void shouldThrowExceptionForDuplicateEmail()
    {
        service.addStudent(new Student(null,"X","X@gmail.com",20));
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                ()->service.addStudent(new Student(null,"Y","X@gmail.com",21))
        );
        assertEquals("Email already exists",ex.getMessage());
    }
}
