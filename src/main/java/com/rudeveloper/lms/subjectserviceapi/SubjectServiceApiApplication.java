package com.rudeveloper.lms.subjectserviceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SubjectServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubjectServiceApiApplication.class, args);
	}

}
