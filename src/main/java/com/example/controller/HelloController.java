package com.example.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entities.Customer;
import com.example.services.HelloService;

//此類別為Spring Controller元件
@Controller
public class HelloController {
	
	HelloService helloService;
	
	public HelloController(HelloService helloService) {
		this.helloService = helloService;
	}

	// 透過 @RequestMapping 指定從/hello會被對應到此hello()方法
	@RequestMapping("/hello")
	// 透過 @ResponseBody 告知Spring，此函數的回傳值是HTTP Response的本文
	public @ResponseBody String hello() {
		List<Customer> customers = helloService.getHelloByName();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < customers.size(); i++) {
			sb.append("id: ");
			sb.append(customers.get(i).getId());
			sb.append("<br/>");
			
			sb.append("name: ");
			sb.append(customers.get(i).getName());
			sb.append("<br/>");
			
		}
		return sb.toString();
	}
}
