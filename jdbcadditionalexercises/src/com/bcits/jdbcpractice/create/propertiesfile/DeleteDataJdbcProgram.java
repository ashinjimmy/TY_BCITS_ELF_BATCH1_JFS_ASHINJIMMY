package com.bcits.jdbcpractice.create.propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DeleteDataJdbcProgram {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;

		try {
			FileInputStream file = new FileInputStream("dbinfo.properties");
			Properties properties = new Properties();
			properties.load(file);

			//1. Load the Driver

			Class.forName(properties.getProperty("driverName")).newInstance();

			//2. Get the DB connection via Driver

			con = DriverManager.getConnection(properties.getProperty("dbUrl"),properties);

			//3. Issue the Sql Query via connection

			String query = " delete from employee_primary_info " + " where emp_id = 130; ";

			stmt = con.createStatement();
			int rst = stmt.executeUpdate(query);

            //4. Process the result returned by the query

			System.out.println(rst + " number of rows affected ");

		} catch (Exception e) {
			e.printStackTrace();
		} finally { // 5. Close all Jdbc objects
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//End of finally block

	}//End of the main()

}//End of the Class
