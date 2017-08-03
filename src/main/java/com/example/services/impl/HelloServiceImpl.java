package com.example.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.HelloDao;
import com.example.services.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	@Autowired
	private HelloDao helloDao;

	@Override
	public String getHelloByName(String name) {
		return this.helloDao.getHello();
	}
}
