package com.bcits.preparedstatement.curdoperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

import com.bcits.jdbcapp.connection.DriverManager;

public class DeleteOperation {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			FileInputStream file = new FileInputStream("db2.properties");
			Properties properties = new Properties();
			properties.load(file);
			
			Class.forName(properties.getProperty("driverName")).newInstance();
			
			con = DriverManager.getConnection(properties.getProperty(dbURL));
			
			String query = " delete from employee_primary_info "
					+ " where emp_id = ?;";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			int rs = pstmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
