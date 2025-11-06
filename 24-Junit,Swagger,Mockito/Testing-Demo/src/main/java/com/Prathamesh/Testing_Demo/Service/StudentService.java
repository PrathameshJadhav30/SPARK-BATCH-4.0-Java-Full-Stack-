package com.Prathamesh.Testing_Demo.Service;

import com.Prathamesh.Testing_Demo.Entity.Student;
import com.Prathamesh.Testing_Demo.Repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student getStudentById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Student addStudent(Student student) {
        return repo.save(student);
    }

    public Student updateStudent(Long id, Student studentDetails) {
        Optional<Student> optionalStudent = repo.findById(id);
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            student.setName(studentDetails.getName());
            student.setEmail(studentDetails.getEmail());
            student.setAge(studentDetails.getAge());
            return repo.save(student);
        }
        return null;
    }

    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }
}
