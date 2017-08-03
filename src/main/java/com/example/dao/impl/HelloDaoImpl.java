package com.example.dao.impl;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.HelloDao;
import com.example.entities.Customer;

@Repository
@Qualifier("helloDao")
@Transactional(readOnly = true)
public class HelloDaoImpl implements HelloDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getAllCustomers() {
		Session session = sessionFactory.openSession();
		String hql = "From Customer";
		Query query = session.createQuery(hql);
		List<Customer> customers = (List<Customer>)query.list();
		return customers;
	}

	@Override
	public void insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
