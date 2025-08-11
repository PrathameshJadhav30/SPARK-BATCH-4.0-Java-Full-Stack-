package org.Pratham.SpringBoot02.controller;

import org.Pratham.SpringBoot02.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {

    @Autowired
    studentService service;


    @GetMapping("/welcome")
    public String welcome(){
        return service.getStudentData();
    }
}
