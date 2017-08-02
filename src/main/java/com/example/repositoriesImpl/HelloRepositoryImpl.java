package com.example.repositoriesImpl;

import org.springframework.stereotype.Repository;

import com.example.dao.HelloDao;
import com.example.repositories.HelloRepository;

@Repository
public class HelloRepositoryImpl implements HelloRepository {

	private HelloDao helloDao;
	
	public HelloRepositoryImpl(HelloDao helloDao) {
		this.helloDao = helloDao;
	}

	@Override
	public String getHello() {	
		return "Hello World Bob Repository";
	}

}
