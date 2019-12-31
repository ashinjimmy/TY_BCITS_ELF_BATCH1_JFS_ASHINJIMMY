package com.bcits.jdbcapp.abstraction;

public class ClassY implements Connection {
	
	@Override
	public Statement1 createStatement() {
		
		return new ClassB();
	}

}
