package com.docker.project.dockerproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockerizeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerizeApplication.class, args);
		System.out.println("Hello Application Started");
	}

}
