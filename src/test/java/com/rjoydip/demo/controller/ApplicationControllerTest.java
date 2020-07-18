package com.rjoydip.demo.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class ApplicationControllerTest {
    
    private ApplicationController method;

    @BeforeEach
    public void setUp() throws Exception {
        method = new ApplicationController();        
    }

    @Test
    public void getOutput() throws Exception {
        assertThat(method.getStatus()).isEqualTo("[output]: application controller working");
    }
}