package com.bcits.jdbcpractice.create.propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class InsertDataJdbcProgram {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;

		try {
			FileInputStream file = new FileInputStream("dbInfo.properties");
			Properties properties = new Properties();
			properties.load(file);

			//1. Load the driver
			
			Class.forName(properties.getProperty("driverName")).newInstance();

			//2. Get DB connection via Driver
			
			con = DriverManager.getConnection(properties.getProperty
					("dbUrl"),properties.getProperty("user"),
					properties.getProperty("password"));
			
			//3. Issue Sql queries via Connection

			String query = "Insert into employee_primary_info(emp_id,"
					+ "emp_name,emp_mobileno,official_mailid, date_of_birth,"
					+ "date_of_join,designation,blood_group, "
					+ "salary,dept_id,manager_id)"
					+ "values(130,'Mahi',8990178631,'mahi@gmail.com',"
					+ "'1992-02-12','2017-08-18','HR','B+ve',64000,40,3);";
			
			stmt = con.createStatement();
			int rst = stmt.executeUpdate(query);
			
			//4. Process the results returned from the Sql Query
			
			System.out.println(rst+" number of rows affected");
					

		} catch (Exception e) {
			e.printStackTrace();
		} finally { //5. Close all jdbc objects
			
			try {
				if(con != null) {
					con.close();
				}
				if(stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//End of the finally block

	}//End of the main()

}//End of the Class
