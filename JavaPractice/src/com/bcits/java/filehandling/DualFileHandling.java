package com.bcits.java.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DualFileHandling {
	 
 
	public static void main(String[] args) throws IOException {
		
		
		String path1 = "D:\\codingPractice\\bcitsJavaPractice\\fileHandling\\dualFile\\msg1.txt";
        String path2 = "D:\\codingPractice\\bcitsJavaPractice\\fileHandling\\dualFile\\msg2.txt";
	    String path3 = "D:\\codingPractice\\bcitsJavaPractice\\fileHandling\\dualFile\\msg3.txt";
 
	    File f1 = new File(path1);
		File f2 = new File(path2);
        File f3 = new File(path3);
        
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
		        
		try {
			FileWriter fw1 = new FileWriter(f1);
			System.out.println("Input the message to write  the file 1 ");
			String msg1 = sc1.nextLine();
			fw1.write(msg1);
			fw1.flush();
			
			 FileWriter fw2 = new FileWriter(f2);
			 System.out.println("Input the message to write  the file 2  ");
			 String msg2 = sc2.nextLine();
			 fw2.write(msg2);
			 fw2.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		try {
			FileReader fr1 = new FileReader(f1);
			 int len1 = (int) f1.length();
			 char []ch1 = new char[len1];
			 fr1.read(ch1);
			 
			 FileReader fr2 = new FileReader(f2);
			 int len2 = (int) f2.length();
			 char []ch2 = new char[len2];
			 fr2.read(ch2);
			 FileWriter fw3 = new FileWriter(f3);			
			 
			 fw3.write(ch1);
			 fw3.write(ch2);
			 fw3.flush();
			 
			 System.out.println("File Writing is completed");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
