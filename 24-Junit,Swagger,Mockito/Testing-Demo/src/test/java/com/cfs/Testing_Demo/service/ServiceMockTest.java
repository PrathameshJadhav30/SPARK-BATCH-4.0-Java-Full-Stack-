package com.cfs.Testing_Demo.service;

import com.cfs.Testing_Demo.entity.Student;
import com.cfs.Testing_Demo.repo.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.when;

public class ServiceMockTest {

    @Mock
    private StudentRepository repo;

    @InjectMocks
    private StudentService service;

    private Student student;

    @BeforeEach
    void setup()
    {
        MockitoAnnotations.openMocks(this);
        student = new Student(1L,"Ashwani","ashwani@gmail.com",25);
    }

    @Test
    void testAddStudent()
    {
        when(repo.existsByEmail(student.getEmail())).thenReturn(false);
        when(repo.save(student)).thenReturn(student);

        Student res=service.addStudent(student);
        assertEquals("Ashwani",res.getName());
    }

    @Test
    void testGetAllStudent()
    {
        when(repo.findAll()).thenReturn(List.of(student));
        List<Student> res=service.getAll();

        assertEquals(1,res.size());
    }
}
