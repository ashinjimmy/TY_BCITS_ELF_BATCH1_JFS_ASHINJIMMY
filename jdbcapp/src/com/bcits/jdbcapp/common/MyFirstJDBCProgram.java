package com.bcits.jdbcapp.common;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MyFirstJDBCProgram {
	public static void main(String[] args) {
		Connection con = null;
		ResultSet rs = null;
		Statement stmt = null;

		try {
			// 1. Load the "Driver"

			Driver driverRef = new Driver();
			DriverManager.registerDriver(driverRef);
 
			// 2. Get the "DB Connection" via "Driver"

			String dburl = "jdbc:mysql://localhost:3306/employee_management_info?user=root&password=root";
			con = DriverManager.getConnection(dburl);

			// 3. Issue "SQL Queries" via "Connection"

			String query = "select*  from employee_primary_info";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			// 4."Process the Results" returned by "SQL Queries"

			while (rs.next()) {
				int employeeID = rs.getInt("emp_id");
				String employeeName = rs.getString("emp_name");
				long mobileNo = rs.getLong("emp_mobileno");
				String emailId = rs.getString("official_mailid");
				Date dob = rs.getDate("date_of_birth");
				Date doj = rs.getDate("date_of_join");
				String designation = rs.getString("designation");
				String bloodGroup = rs.getString("blood_group");
				double salary = rs.getDouble("salary");
				int deptID = rs.getInt("dept_id");
				int managerID = rs.getInt("manager_id");

				System.out.println("Employee ID ===> " + employeeID);
				System.out.println("Employee Name ===> " + employeeName);
				System.out.println("Mobile Number ===> " + mobileNo);
				System.out.println("Email ID ===>" + emailId);
				System.out.println("Date of Birth ===> " + dob);
				System.out.println("Date of Join ===> " + doj);
				System.out.println("Designation ===> " + designation);
				System.out.println("Blood Group ===>" + bloodGroup);
				System.out.println("Salary ===> " + salary);
				System.out.println("Department ID ===> " + deptID);
				System.out.println("Manager ID ===> " + managerID);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5. Close All "JDBC Objects"
			try {
				if (con != null) {
					con.close();
				}
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} // End of the inner try-catch Block

		} // End of finally Block

	}// End of Main()

}// End of Class
