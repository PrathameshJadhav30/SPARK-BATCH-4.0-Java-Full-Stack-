package org.Pratham.SpringBoot02.service;


import org.Pratham.SpringBoot02.repo.studentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentService {

    @Autowired
    studentRepo studentRepo;

    public String getStudentData(){
     return studentRepo.getData();
    }
}
