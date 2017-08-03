package com.example.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.HelloDao;
import com.example.entities.Customer;
import com.example.services.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	@Autowired
	private HelloDao helloDao;

	@Override
	public List<Customer> getHelloByName() {
		return helloDao.getAllCustomers();
	}
}
