package com.bcits.jdbcapp.common;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class InsertStaticSqlQuery {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;

		try {
			
			// 1. Load the driver

//		Driver driverref = new Driver();
//		DriverManager.registerDriver( driverref);

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// 2. Issue the Sql Query via Driver

			String dbURL = "jdbc:mysql://127.0.0.1:3306/employee_management_info";
			//con = DriverManager.getConnection(properties.getProperty("dbURL"),properties.getProperty("user"),properties.getProperty("password"));
 
			 con = DriverManager.getConnection(dbURL,"root","root");
			// 3. Issue the Query
			String query = " insert into employee_primary_info "
					+ " values(110,'RamDas',7890123456,'ram@gmail.com','1994-10-18','2019-10-08','salesman','B+ve',20000,20,3); ";
			stmt = con.createStatement();
			
			//4. Process the  Results
			int result = stmt.executeUpdate(query);
			System.out.println(result + " Number of rows");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (con != null) {
					con.close();
				}

				if (stmt != null) {
					stmt.close();
				}
			}

			catch (Exception e2) {

			}

		}

	}

}
