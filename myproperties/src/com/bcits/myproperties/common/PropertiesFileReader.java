package com.bcits.myproperties.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
	public static void main(String[] args) {
		
		try {
			FileInputStream inputStram = new FileInputStream("dbInfo.properties");
			Properties  properties = new Properties();
			
				properties.load(inputStram);
				System.out.println("Driver Name-----> "+properties.getProperty("driverName"));
				System.out.println("dbURL -----> "+properties.getProperty("dbURL"));
				System.out.println("User -----> "+properties.getProperty("user"));
				System.out.println("Password ----> "+properties.getProperty("password"));
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}//End of the main()

}// End of the Class
