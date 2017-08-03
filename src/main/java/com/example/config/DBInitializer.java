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


	@PostConstruct
	public void initialize() {
		try{
			Connection connection = DriverManager.getConnection("jdbc:sqlite:db/demo.db");
			Statement stmt = connection.createStatement();
			stmt = connection.createStatement();
			stmt.executeUpdate("DROP TABLE IF EXISTS customer");
			stmt.executeUpdate("CREATE TABLE customer("
					+ "ID INT PRIMARY KEY     NOT NULL,"
					+ "NAME           TEXT    NOT NULL,"
					+ "ADDRESS        CHAR(50));");
			stmt.executeUpdate("INSERT INTO customer (ID, NAME, ADDRESS) VALUES (1, 'Alice', 'Hawaii'), (2, 'Bob', 'Japan');");
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
