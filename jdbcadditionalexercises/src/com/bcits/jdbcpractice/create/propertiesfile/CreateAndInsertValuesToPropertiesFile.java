package com.bcits.jdbcpractice.create.propertiesfile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class CreateAndInsertValuesToPropertiesFile {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fileoutstream = new FileOutputStream("dbinfo.properties");
			Properties properties = new Properties();
			
			properties.setProperty("driverName", "com.mysql.jdbc.Driver");
			properties.setProperty("dbUrl", "jdbc:mysql://localhost:3306/employee_management_info");
			properties.setProperty("user", "root");
			properties.setProperty("password", "Dio1054@Ash");
			
			properties.store(fileoutstream, "DB Inforamtion");
			System.out.println("Data saved in the properties file successfully");	
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}//End of the try-catch block
	

	}//End of the main()

}//End of the class
