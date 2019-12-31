package com.bcits.jdbcapp.connection;

public class Driver {

	public static void main(String[] args) {
		
		//MyInterface con = new ClassB();
		
		String dbUrl = "One";
		
		Connection con = DriverManager.getConnection(dbUrl); // good example for run time example
		con.toString();// example of Inheritance
		con.print();

	}// end of Main

}//End of Class
