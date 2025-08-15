package com.Pratham.JPA01.controller;

import com.Pratham.JPA01.entity.Student;
import com.Pratham.JPA01.repo.StudnetRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudnetController {

    private final StudnetRepo studnetRepo;
    public StudnetController(StudnetRepo studnetRepo)
    {
        this.studnetRepo=studnetRepo;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student)
    {
        return studnetRepo.save(student);
    }

    @GetMapping
    public List<Student> getAllStudents()
    {
        return studnetRepo.findAll();
    }

    @PutMapping
    public Student updateStudent(@RequestParam Long id, @RequestBody Student student)
    {
        Student s = studnetRepo.findById(id)
                .orElseThrow(()->new RuntimeException("Student Not Found"));
        s.setName(student.getName());
        s.setEmail(student.getEmail());
        return studnetRepo.save(s);
    }

    @PatchMapping
    public Student patchStudent(@RequestParam Long id,@RequestParam String name)
    {
        Student s = studnetRepo.findById(id)
                .orElseThrow(()->new RuntimeException("Student Not Found"));
        s.setName(name);
        return s;
    }
}
