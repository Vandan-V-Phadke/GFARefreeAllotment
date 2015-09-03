package dao;

import java.sql.*;

public class SQLConnection {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost:3306/gfa";
	static final String USER = "root";
	static final String PASS = "";
	
	Connection conn ;
	
	public Connection getConnection() throws SQLException, ClassNotFoundException{
		
		Class.forName("com.mysql.jdbc.Driver"); 
		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(DB_URL,USER,PASS);
		return conn;
	}

	public void closeConnection () throws SQLException{
		conn.close();
	}
}
