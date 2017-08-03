package com.example.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.example.dao.HelloDao;

@Repository
@Qualifier("helloDao")
public class HelloDaoImpl implements HelloDao {

	@Override
	public String getHello() {
		return "Hello World Bob Repository";
	}

}
