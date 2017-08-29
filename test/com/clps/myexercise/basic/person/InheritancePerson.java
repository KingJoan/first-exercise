package com.clps.myexercise.basic.person;

import org.apache.tomcat.jni.Stdlib;
import org.junit.Test;

public class InheritancePerson {

	@Test
	public void test() {
		Student student=new Student();
		student.setName("张三");
		student.setAge(18);
		student.dining();
		student.examination();
		
		Teacher teacher=new Teacher();
		teacher.setName("老师");
		teacher.setAge(65);
		teacher.setSalary(5200);
		teacher.dining();
		teacher.prelection();
		
		Person stu=new Student();
		stu.dining();
	}

}
