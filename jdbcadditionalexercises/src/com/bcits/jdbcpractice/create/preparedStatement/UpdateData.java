package com.bcits.jdbcpractice.create.preparedStatement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class UpdateData implements AutoCloseable {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			FileInputStream file = new FileInputStream("dbinfo.properties");
			Properties properties = new Properties();
			properties.load(file);

			Class.forName(properties.getProperty("driverName")).newInstance();

			con = DriverManager.getConnection(properties.getProperty("dbUrl"), properties);

			String query = " update employee_primary_info " + 
			" set designation = ? where emp_id = ?;";

			pstmt = con.prepareStatement(query);
			pstmt.setString(1, args[0]);
			pstmt.setInt(2, Integer.parseInt(args[1]));
			int rst = pstmt.executeUpdate();

			if (rst > 0) {
				System.out.println(rst + " number of rows affected");
			} else {
				System.out.println("Record already exist!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}// End of the main()

	@Override
	public void close() throws Exception {

	}

}// End of the class
