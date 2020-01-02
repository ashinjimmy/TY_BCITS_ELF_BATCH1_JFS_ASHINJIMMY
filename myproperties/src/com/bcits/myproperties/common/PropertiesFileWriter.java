package com.bcits.myproperties.common;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileWriter {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fileOutputStram = new FileOutputStream("dbInfo.properties");
			Properties properties = new Properties();
			properties.setProperty("driverName","com.mysql.jdbc.Driver");
			properties.setProperty("dbURL","jdbc:mysql://localhost:3306/employee_management_info?" );
			properties.setProperty("user","root");
			properties.setProperty("password","root");
			try {
				properties.store(fileOutputStram,"DB details");
				System.out.println("File Created");
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}


	}// End of the main()

}// End of the class
