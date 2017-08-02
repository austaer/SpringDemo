package com.example.servicesImpl;

import org.springframework.stereotype.Service;

import com.example.repositories.HelloRepository;
import com.example.services.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	private HelloRepository helloRepository;
	
	public HelloServiceImpl(HelloRepository helloRepository) {
		this.helloRepository = helloRepository;
	}
	
	@Override
	public String getHelloByName(String name) {
		return "Hello world, " + name;
	}
}
