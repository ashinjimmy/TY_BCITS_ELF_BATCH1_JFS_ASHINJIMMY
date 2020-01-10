package com.bcits.jdbcpractice.create.propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class FirstJdbcProgramWithPropertiesFile implements AutoCloseable {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rst = null;

		try {

			FileInputStream file = new FileInputStream("dbinfo.properties");
			Properties properties = new Properties();

			properties.load(file);

			// 1. Load the Driver

			Class.forName(properties.getProperty("driverName")).newInstance();

			// 2. Get the DB connection using Driver

			con = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("user"),
					properties.getProperty("password"));

			// 3. Issue SQL Queries via Connection

			String query = "select * from employee_primary_info";
			stmt = con.createStatement();
			rst = stmt.executeQuery(query);
			// int result = ((Number) rst.getObject(1)).intValue();
			// int result = Integer.parseInt(rst.getObject(1).toString());

			while (rst.next()) {
				int empid = rst.getInt("emp_id");
				String empname = rst.getString("emp_name");
				long empmob = rst.getLong("emp_mobileno");
				String mailid = rst.getString("official_mailid");
				Date dob = rst.getDate("date_of_birth");
				Date doj = rst.getDate("date_of_join");
				String designation = rst.getString("designation");
				String bloodgrp = rst.getString("blood_group");
				double salary = rst.getDouble("salary");
				int depid = rst.getInt("dept_id");
				int managerid = rst.getInt("manager_id");

				System.out.println("---------------------Employee Details-------------------\n");
				System.out.println("Employee ID = " + empid);
				System.out.println("Employee Name = " + empname);
				System.out.println("Mobile Number = " + empmob);
				System.out.println("Email ID = " + mailid);
				System.out.println("Date of Birth = " + dob);
				System.out.println("Date of Join = " + doj);
				System.out.println("Designation = " + designation);
				System.out.println("Blood Group = " + bloodgrp);
				System.out.println("Salary = " + salary);
				System.out.println("Department ID = " + depid);
				System.out.println("Manager ID = " + managerid);


			}

		} catch (Exception e) {
			e.printStackTrace();
		} // End of the try-catch block

	}// End of the main()
	@Override
	public void close() throws Exception {
		System.out.println("Closed all JDBC objects with Try with Resource");
		
	}

}// End of the class
