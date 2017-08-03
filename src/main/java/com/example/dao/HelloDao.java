package com.example.dao;

import java.util.List;

import com.example.entities.Customer;;


public interface HelloDao {
	public List<Customer> getAllCustomers();
	
	public void insertCustomer(Customer customer);
}
