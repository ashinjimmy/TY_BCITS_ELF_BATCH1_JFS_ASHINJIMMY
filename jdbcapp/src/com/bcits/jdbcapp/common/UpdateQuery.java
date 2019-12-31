package com.bcits.jdbcapp.common;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class UpdateQuery {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		
		try {
		
			FileInputStream file = new FileInputStream("db.properties");
			Properties properties = new Properties();
			properties.load(file);
			
			Class.forName(properties.getProperty("driveName")).newInstance();
			
			con = DriverManager.getConnection(properties.getProperty("dburl"),properties);
			
			String query = "update employee_primary_info set emp_id = 1000 where emp_id = 10";
		    stmt = con.createStatement();
		    
			int result = stmt.executeUpdate(query);
			System.out.println(result+" Number of rows affected");
			
		} catch (Exception e) {
			
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
