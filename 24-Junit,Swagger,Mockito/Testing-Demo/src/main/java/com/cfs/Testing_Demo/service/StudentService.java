package com.cfs.Testing_Demo.service;

import com.cfs.Testing_Demo.entity.Student;
import com.cfs.Testing_Demo.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public List<Student> getAll()
    {
        return studentRepository.findAll();
    }

    public Student addStudent(Student student)
    {
        System.out.println("calling create service.....");
        if (studentRepository.existsByEmail(student.getEmail()))
        {
            throw  new IllegalArgumentException("Email already exists");
        }
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id)
    {
        studentRepository.deleteById(id);
    }
}
