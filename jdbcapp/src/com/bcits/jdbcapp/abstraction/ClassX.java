package com.bcits.jdbcapp.abstraction;

public class ClassX implements Connection {
	@Override
	public Statement1 createStatement() {
		
	
		return new ClassA();
	}
	

}
