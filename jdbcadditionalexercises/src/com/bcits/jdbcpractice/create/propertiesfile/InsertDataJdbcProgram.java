package com.bcits.jdbcpractice.create.propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class InsertDataJdbcProgram {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			FileInputStream file = new FileInputStream("dbinfo.properties");
			Properties properties = new Properties();
			properties.load(file);
			
			Class.forName(properties.getProperty("driverName")).newInstance();
			
			con = DriverManager.getConnection(properties.getProperty
					("dbUrl"),properties);
			
			String query = "insert into proj_info values (?,?,?,'2020-02-19','2020-12-12',?);";
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, args[1]);
			pstmt.setString(3, args[2]);
			pstmt.setString(6, args[3]);
			
			int rst = pstmt.executeUpdate();
			
			System.out.println(rst+" number of rows affected");
					

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(con != null) {
					con.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//End of the finally block

	}//End of the main()

}//End of the Class
