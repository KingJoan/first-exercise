package com.clps.myexercise.basic;

import org.junit.Test;

public class CalcuTest {

	@Test
	public void testCalcu() {
		Calcu calcu=new Calcu(2, 3);
		System.out.println(calcu.add());
	}

}
