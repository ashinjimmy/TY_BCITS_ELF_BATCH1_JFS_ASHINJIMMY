package com.bcits.jdbcapp.abstraction;

public class DriverManager {

	private DriverManager() {
	}

	public static Connection getConnection(String dbUrl) {
		Connection con = null;
		if(dbUrl.equals("one")) {
			con = new ClassY();	
		} else {
			con = new ClassX();
		}
		return con;
	}
}
