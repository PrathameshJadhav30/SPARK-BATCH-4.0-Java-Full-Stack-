package com.Prathamesh.Testing_Demo.Controller;

import com.Prathamesh.Testing_Demo.Entity.Student;
import com.Prathamesh.Testing_Demo.Service.StudentService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StudentService service;

    @Autowired
    private ObjectMapper objectMapper;

    private Student student1;
    private Student student2;

    @BeforeEach
    void setup() {
        student1 = new Student("Prathamesh Jadhav", "prathamesh@example.com", 21);
        student1.setId(1L);

        student2 = new Student("Aditi Patil", "aditi.patil@example.com", 22);
        student2.setId(2L);
    }

    // 🧪 Test 1 - GET all students
    @Test
    @Order(1)
    void testGetAllStudents() throws Exception {
        List<Student> students = Arrays.asList(student1, student2);
        when(service.getAllStudents()).thenReturn(students);

        mockMvc.perform(get("/students"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()", is(2)))
                .andExpect(jsonPath("$[0].name", is("Prathamesh Jadhav")))
                .andExpect(jsonPath("$[1].name", is("Aditi Patil")));

        verify(service, times(1)).getAllStudents();
    }

    // 🧪 Test 2 - GET student by ID
    @Test
    @Order(2)
    void testGetStudentById() throws Exception {
        when(service.getStudentById(1L)).thenReturn(student1);

        mockMvc.perform(get("/students/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is("Prathamesh Jadhav")))
                .andExpect(jsonPath("$.email", is("prathamesh@example.com")));

        verify(service, times(1)).getStudentById(1L);
    }

    // 🧪 Test 3 - POST add new student
    @Test
    @Order(3)
    void testAddStudent() throws Exception {
        when(service.addStudent(any(Student.class))).thenReturn(student1);

        mockMvc.perform(post("/students")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(student1)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is("Prathamesh Jadhav")))
                .andExpect(jsonPath("$.age", is(21)));

        verify(service, times(1)).addStudent(any(Student.class));
    }

    // 🧪 Test 4 - PUT update student
    @Test
    @Order(4)
    void testUpdateStudent() throws Exception {
        Student updatedStudent = new Student("Prathamesh Updated", "updated@example.com", 23);
        updatedStudent.setId(1L);

        when(service.updateStudent(eq(1L), any(Student.class))).thenReturn(updatedStudent);

        mockMvc.perform(put("/students/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(updatedStudent)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is("Prathamesh Updated")))
                .andExpect(jsonPath("$.email", is("updated@example.com")));

        verify(service, times(1)).updateStudent(eq(1L), any(Student.class));
    }

    // 🧪 Test 5 - DELETE student
    @Test
    @Order(5)
    void testDeleteStudent() throws Exception {
        doNothing().when(service).deleteStudent(anyLong());

        mockMvc.perform(delete("/students/1"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Student with ID 1 deleted successfully!")));

        verify(service, times(1)).deleteStudent(1L);
    }
}
