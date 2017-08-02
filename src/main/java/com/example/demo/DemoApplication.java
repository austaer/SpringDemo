package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//這邊使用 Java Class 作為設定，而非XML
@Configuration
//啟用 Spring Boot 自動配置，將自動判斷專案使用到的套件，建立相關的設定。
@EnableAutoConfiguration
//自動掃描 Spring Bean 元件
@ComponentScan( basePackages = {"com.example.repositoriesImpl", "com.example.servicesImpl", "com.example.controller"} )
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
