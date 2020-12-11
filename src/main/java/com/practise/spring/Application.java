package com.practise.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EntityScan({"org.springframework.security.core.userdetails.*","com.practise.spring.entities.*"})
//@EnableJpaRepositories("com.practise.spring.dao.*")

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
