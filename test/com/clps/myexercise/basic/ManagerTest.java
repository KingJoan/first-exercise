package com.clps.myexercise.basic;

import static org.junit.Assert.*;

import org.junit.Test;

public class ManagerTest {

	@Test
	public void test() {
		Manager manager=new Manager("张三", "111111");
		manager.show();
		
	}

}
