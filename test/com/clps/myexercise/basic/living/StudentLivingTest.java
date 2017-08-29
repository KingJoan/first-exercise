package com.clps.myexercise.basic.living;

import org.junit.Test;

import com.clps.myexercise.basic.living.impl.StudentLiving;

public class StudentLivingTest {

	@Test
	public void test() {
		StudentLiving student=new StudentLiving();
		student.eat();
		student.sleep();
		student.breath();
		student.think();
		student.study();
	}

}
