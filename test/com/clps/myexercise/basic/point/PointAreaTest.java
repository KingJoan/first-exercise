package com.clps.myexercise.basic.point;

import org.junit.Test;

public class PointAreaTest {

	@Test
	public void test() {
		Circle circle=new Circle(0f, 0f, 2f);
		System.out.println(circle.area());
		System.out.println(circle.value());
	}

}
