package com.clps.myexercise.basic.studentT;

import java.util.ArrayList;

import org.junit.Test;

public class StudentTest {

	@Test
	public void test() {

		Student<Integer> stu1=new Student<Integer>("张三",12);
		Student<String> stu2=new Student<String>("李四", "男");
		System.out.println(stu1.getName()+"."+stu1.getT());
		System.out.println(stu2.getName()+"."+stu2.getT());
		
		Student<String> stu3=new Student<String>("张三", "12");
		Student<String> stu4=new Student<String>("张三", "女生");
		System.out.println(stu3.getName()+"."+stu3.getT());
		System.out.println(stu4.getName()+"."+stu4.getT());
		
		ArrayList al=new ArrayList();
		Student stud1=new Student<Integer>("张三", 1);
		Student stud2=new Student<Integer>("李四", 3);
		al.add(stud1);
		al.add(stud2);
		for (int i = 0; i < al.size(); i++) {
			Student<Integer> student=(Student<Integer>)al.get(i);
			System.out.println(student.getName()+student.getT());
		}
	}

}
