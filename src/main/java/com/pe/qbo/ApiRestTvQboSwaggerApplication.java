package com.pe.qbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ApiRestTvQboSwaggerApplication {

	//http://localhost:9950/v2/api-docs
	//http://localhost:9950/swagger-ui.html
	public static void main(String[] args) {
		SpringApplication.run(ApiRestTvQboSwaggerApplication.class, args);
	}

}
