package com.rjoydip.demo;

import com.rjoydip.demo.controller.ApplicationController;
import com.rjoydip.demo.controller.StudentController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ApplicationController applicationController;

	@Autowired
	StudentController studentController;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			logger.info(applicationController.getStatus());
			logger.info("Student id 10001 -> {}", studentController.findById(10001L));
		};
	}
}
