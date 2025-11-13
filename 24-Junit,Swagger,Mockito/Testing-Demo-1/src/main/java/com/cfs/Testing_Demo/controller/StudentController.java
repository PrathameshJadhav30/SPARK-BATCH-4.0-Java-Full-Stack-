package com.cfs.Testing_Demo.controller;


import com.cfs.Testing_Demo.entity.Student;
import com.cfs.Testing_Demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    public StudentService service;

    @GetMapping
    public List<Student> getAll()
    {
        return service.getAll();
    }

    @PostMapping
    public Student create(@RequestBody Student student)
    {
        System.out.println("calling create controller");
       return service.addStudent(student);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id)
    {
        service.deleteStudent(id);
    }
}
