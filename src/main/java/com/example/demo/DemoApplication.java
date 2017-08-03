package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//這邊使用 Java Class 作為設定，而非XML
@SpringBootApplication
@ComponentScan(basePackages = { "com.example.config", "com.example.dao", "com.example.services",
		"com.example.controller" })
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
