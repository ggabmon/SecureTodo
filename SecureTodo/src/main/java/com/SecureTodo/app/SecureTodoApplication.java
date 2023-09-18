package com.SecureTodo.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@MapperScan(basePackages = "com.SecureTodo.app.member.mapper")
public class SecureTodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureTodoApplication.class, args);
	}

}
