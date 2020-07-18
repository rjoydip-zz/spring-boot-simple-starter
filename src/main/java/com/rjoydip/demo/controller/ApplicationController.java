package com.rjoydip.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class ApplicationController {

    public String getStatus() {
        return "[output]: application controller working";
    }
}