package com.clps.myexercise.basic.plane;

import org.junit.Test;

public class FlyTest {

	@Test
	public void test() {
		Fly bird=new Bird();
		Fly air=new Air();
		bird.fly();
		air.fly();
	}

}
