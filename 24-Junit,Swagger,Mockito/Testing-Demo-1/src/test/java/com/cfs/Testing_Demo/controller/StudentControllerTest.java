package com.cfs.Testing_Demo.controller;

import com.cfs.Testing_Demo.entity.Student;
import com.cfs.Testing_Demo.repo.StudentRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper mapper;

    @Autowired
    private StudentRepository repo;

    @BeforeEach
    void cleanDB()
    {
        repo.deleteAll();
    }


    @Test
    @Order(1)
    void shouldCreateStudent() throws Exception
    {
        Student student=new Student(null,"Ashwani","ashwani@gmail.com",25);

        mockMvc.perform(post("/api/students")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(student)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Ashwani"));

    }

 /*   @Test
    @Order(2)
    void shouldFetchAllStudent() throws Exception
    {
        repo.saveAll()
    }*/
}
