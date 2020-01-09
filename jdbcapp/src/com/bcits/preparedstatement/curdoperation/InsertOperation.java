package com.bcits.preparedstatement.curdoperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class InsertOperation {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			FileInputStream file = new FileInputStream("db2.properties");
			Properties properties = new Properties();
			properties.load(file);

			// 1. Load the driver

			Class.forName(properties.getProperty("driverName")).newInstance();

			// 2. Get DB connection via Driver

			con = DriverManager.getConnection(properties.getProperty("dbURL"), properties);

			// 3. Issue Sql queries via Connection

			String query = "Insert into employee_primary_info" + "values(?,?,?,?,'1992-02-12','2019-12-11',?,?,?,?,?);";

			pstmt = con.prepareStatement(query);
			pstmt.setInt(1,Integer.parseInt(args[0]));
			pstmt.setString(2,args[1]);
			pstmt.setLong(3,Long.parseLong(args[2]));
			pstmt.setString(4,args[3]);
			pstmt.setString(7, args[4]);
			pstmt.setString(8, args[5]);
			pstmt.setDouble(9,Double.parseDouble(args[6]));
			pstmt.setInt(10,Integer.parseInt(args[0]));
			pstmt.setInt(11,Integer.parseInt(args[0]));
		
			int rst = pstmt.executeUpdate();

			// 4. Process the results returned from the Sql Query

			System.out.println(rst + " number of rows affected");

		} catch (Exception e) {
			e.printStackTrace();
		} finally { // 5. Close all jdbc objects

			try {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // End of the finally block

	}// End of the main()

}// End of the Class
