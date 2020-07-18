package com.rjoydip.demo.controller;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.rjoydip.demo.model.Student;
import com.rjoydip.demo.repository.StudentRepository;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class StudentControllerTest {
    @InjectMocks
    StudentController studentController;

    @Mock
    private StudentRepository studentRepository;

    @BeforeAll
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getStudentById() {
        Long id = 10001L;
        Student s = new Student();
        s.setId(id);
        when(studentRepository.findById(id)).thenReturn((s));
        Student student = studentController.findById(id);
        verify(studentRepository).findById(id);
        assertThat(student.getId()).isEqualTo(id);
    }
}