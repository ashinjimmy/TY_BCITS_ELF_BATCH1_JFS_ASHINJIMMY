package com.bcits.jdbcapp.connection;

public class DriverManager {
	
	private  DriverManager() {}
	public DriverManager(int a) {
		
	}
	
	public static Connection getConnection(String str) {
		//Some Business Logic
		Connection con = null;
		if (str.equals("One")) {
			con = new ClassA();
		} else {
			con = new ClassB();
		}
		return con;

	}// End of myMethod( )

}// End of Class
