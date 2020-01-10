package com.bcits.jdbcpractice.create.preparedStatement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class DeleteData implements AutoCloseable {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			FileInputStream file = new FileInputStream("dbinfo.properties");
			Properties properties = new Properties();

			properties.load(file);

			Class.forName(properties.getProperty("driverName")).newInstance();

			con = DriverManager.getConnection(properties.getProperty("dbUrl"), properties);

			String query = " Delete from employee_primary_info " + " where emp_id = ? ;";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			int rst = pstmt.executeUpdate();
			if (rst > 0) {
				System.out.println(rst + " number of rows affected");
			} else {
				System.out.println("Record Already Exist!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// End of the main()

	@Override
	public void close() throws Exception {

	}

}// End of the class
