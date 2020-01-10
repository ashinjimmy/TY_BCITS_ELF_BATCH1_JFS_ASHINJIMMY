package com.bcits.jdbcpractice.create.preparedStatement;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class SelectionOfTwoRows {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rst = null;

		try {
			
			FileInputStream file = new FileInputStream("dbinfo.properties");
			Properties properties = new Properties();
			properties.load(file);
			// 1. Load the Driver

			Class.forName(properties.getProperty("driverName")).newInstance();

			// 2. Get the DB connection via Driver

//			String dbUrl = "jdbc:mysql://127.0.0.1:3306/ employee_management_info";
			con = DriverManager.getConnection(properties.getProperty("dbUrl"),properties);

			// 3. Issue the SQL Queries via Connection

			String query = " select * from employee_primary_info " + " where emp_id in (?,?); ";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			rst = pstmt.executeQuery();
			pstmt.setInt(1, Integer.parseInt(args[1]));
			rst = pstmt.executeQuery();
			

			// 4. Process the Result returned by the SQL Query

			if (rst.next()) {
				int Emp_ID = rst.getInt("emp_id");
				String Name = rst.getString("emp_name");
				long Emp_mobileno = rst.getLong("emp_mobileno");
				String emailId = rst.getString("official_mailid");
				Date dob = rst.getDate("date_of_birth");
				Date doj = rst.getDate("date_of_join");
				String designation = rst.getString("designation");
				String bloodGroup = rst.getString("blood_group");
				double salary = rst.getDouble("salary");
				int deptID = rst.getInt("dept_id");
				int managerID = rst.getInt("manager_id");

				System.out.println("Employee ID ===> " + Emp_ID);
				System.out.println("Employee Name ===> " + Name);
				System.out.println("Employee Mobile Number ===>" + Emp_mobileno);
				System.out.println("Email ID ===>" + emailId);
				System.out.println("Date of Birth ===> " + dob);
				System.out.println("Date of Join ===> " + doj);
				System.out.println("Designation ===>" + designation);
				System.out.println("Blood Group ===>" + bloodGroup);
				System.out.println("Salary ===>" + salary);
				System.out.println("Department ID ===>" + deptID);
				System.out.println("Manager ID ===>" + managerID);

			} else {
				System.err.println("Employee Data Not Found in DB !!!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally { // step 5. Close all the JDBC objects

			try {

				if (con != null) {
					con.close();
				}
				if (rst != null) {
					rst.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			} // End of the inner try-catch Block

		} // End of the finally Block

	}// End of the main()

}// End of the class
