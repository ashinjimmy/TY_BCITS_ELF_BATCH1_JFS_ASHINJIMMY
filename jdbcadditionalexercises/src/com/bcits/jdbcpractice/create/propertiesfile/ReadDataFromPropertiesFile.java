package com.bcits.jdbcpractice.create.propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream file = new FileInputStream("dbinfo.properties");
			Properties properties = new Properties();
			properties.load(file);
			System.out.println("DB Details fetched successfully\n");
			System.out.println("Drive Name ---> "+properties.getProperty("driverName"));
			System.out.println("dbUrl ---> "+properties.getProperty("dbUrl"));
			System.out.println("user ---> "+properties.getProperty("user"));
			System.out.println("password ---> "+properties.getProperty("password"));
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}//End of the try-catch block


	}//End of the main()

}//End of the class 
