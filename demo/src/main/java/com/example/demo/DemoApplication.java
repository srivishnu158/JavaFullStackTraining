package com.example.demo;

import com.example.demo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories("com.example.demo.repository")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		StudentService studentService	= context.getBean(StudentService.class);
		studentService.addSutdent("raj");
	}

}
