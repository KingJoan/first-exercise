package com.clps.myexercise.basic.employee;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void test() {
		Manager manager=new Manager("man", 200f, "south", "com");
		Director director=new Director("dir", 5000f, "sch", 200);
		manager.show();
		director.show();
	}

}
