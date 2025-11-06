package com.Prathamesh.Testing_Demo.Service;

import com.Prathamesh.Testing_Demo.Entity.Student;
import com.Prathamesh.Testing_Demo.Repo.StudentRepository;
import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudentServiceTest {

    @Mock
    private StudentRepository repo;

    @InjectMocks
    private StudentService service;

    private Student student1;
    private Student student2;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        student1 = new Student("Prathamesh Jadhav", "prathamesh@example.com", 21);
        student1.setId(1L);

        student2 = new Student("Aditi Patil", "aditi.patil@example.com", 22);
        student2.setId(2L);
    }

    // 🧪 Test 1 - Add Student
    @Test
    @Order(1)
    void testAddStudent() {
        when(repo.save(student1)).thenReturn(student1);

        Student saved = service.addStudent(student1);

        assertNotNull(saved);
        assertEquals("Prathamesh Jadhav", saved.getName());
        verify(repo, times(1)).save(student1);
    }

    // 🧪 Test 2 - Get All Students
    @Test
    @Order(2)
    void testGetAllStudents() {
        when(repo.findAll()).thenReturn(Arrays.asList(student1, student2));

        List<Student> students = service.getAllStudents();

        assertEquals(2, students.size());
        verify(repo, times(1)).findAll();
    }

    // 🧪 Test 3 - Get Student By ID (Found)
    @Test
    @Order(3)
    void testGetStudentById_Found() {
        when(repo.findById(1L)).thenReturn(Optional.of(student1));

        Student found = service.getStudentById(1L);

        assertNotNull(found);
        assertEquals("Prathamesh Jadhav", found.getName());
        verify(repo, times(1)).findById(1L);
    }

    // 🧪 Test 4 - Get Student By ID (Not Found)
    @Test
    @Order(4)
    void testGetStudentById_NotFound() {
        when(repo.findById(99L)).thenReturn(Optional.empty());

        Student found = service.getStudentById(99L);

        assertNull(found);
        verify(repo, times(1)).findById(99L);
    }

    // 🧪 Test 5 - Update Student (Found)
    @Test
    @Order(5)
    void testUpdateStudent_Found() {
        when(repo.findById(1L)).thenReturn(Optional.of(student1));
        when(repo.save(any(Student.class))).thenReturn(student1);

        Student updatedDetails = new Student("Prathamesh Updated", "prathamesh.updated@example.com", 22);

        Student updated = service.updateStudent(1L, updatedDetails);

        assertNotNull(updated);
        assertEquals("Prathamesh Updated", updated.getName());
        assertEquals("prathamesh.updated@example.com", updated.getEmail());
        verify(repo, times(1)).findById(1L);
        verify(repo, times(1)).save(student1);
    }

    // 🧪 Test 6 - Update Student (Not Found)
    @Test
    @Order(6)
    void testUpdateStudent_NotFound() {
        when(repo.findById(99L)).thenReturn(Optional.empty());

        Student updatedDetails = new Student("Ghost", "ghost@example.com", 25);
        Student result = service.updateStudent(99L, updatedDetails);

        assertNull(result);
        verify(repo, times(1)).findById(99L);
        verify(repo, never()).save(any(Student.class));
    }

    // 🧪 Test 7 - Delete Student
    @Test
    @Order(7)
    void testDeleteStudent() {
        doNothing().when(repo).deleteById(1L);

        service.deleteStudent(1L);

        verify(repo, times(1)).deleteById(1L);
    }
}
