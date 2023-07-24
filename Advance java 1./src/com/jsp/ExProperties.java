package com.jsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class ExProperties {
public static void main(String[] args) {
	
	Properties properties =new Properties();
	try {
		FileInputStream fileInputStream =new FileInputStream("dbconfig.properties");
		
		properties.load(fileInputStream);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager .getConnection("jdbc:mysql:// localhost:3306",properties);
		PreparedStatement preparedStatement=connection.prepareStatement("insert into mybank.exproperties values (?,?)");
		preparedStatement.setInt(2, 5);
		preparedStatement.setString(1, "h");
		preparedStatement.executeUpdate();
		System.out.println("data saved");
		connection.close();
		
	} catch (ClassNotFoundException | SQLException | IOException e) {
		e.printStackTrace();
	}
}
}
