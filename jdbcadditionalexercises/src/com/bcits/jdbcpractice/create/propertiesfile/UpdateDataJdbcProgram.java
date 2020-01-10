package com.bcits.jdbcpractice.create.propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class UpdateDataJdbcProgram {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;

		try {
			FileInputStream file = new FileInputStream("dbInfo.properties");
			Properties properties = new Properties();
			properties.load(file);

			Class.forName(properties.getProperty("driverName")).newInstance();

			con = DriverManager.getConnection(properties.getProperty("dbUrl"), properties.getProperty("user"),
					properties.getProperty("password"));

			String query = " update employee_primary_info set salary = 30000 where salary = 20000 "
					+ " and emp_id = 30 ; ";

			stmt = con.createStatement();
			int rst = stmt.executeUpdate(query);
			System.out.println(rst+" number of rows affected");

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
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}// End of the main()

}// End of the class
