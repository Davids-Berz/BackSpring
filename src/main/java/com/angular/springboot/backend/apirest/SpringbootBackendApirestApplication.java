package com.angular.springboot.backend.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
@EntityScan({"com.angular.backend.commons.models.entity"})
public class SpringbootBackendApirestApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootBackendApirestApplication.class, args);
	}

}
