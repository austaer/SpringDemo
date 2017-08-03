package com.example.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBInitializer {

	@Autowired
	private DataSource dataSource;

	private String getTable() {
		return "CREATE TABLE customer(id Integer Primary key, name varchar(50) not null, address text)";

	}

	@PostConstruct
	public void initialize() {
		try{
			Connection connection = DriverManager.getConnection("jdbc:sqlite:db/demo.db");
			Statement stmt = connection.createStatement();
			stmt = connection.createStatement();
			stmt.executeUpdate("DROP TABLE IF EXISTS customer");
			stmt.executeUpdate(this.getTable());
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
