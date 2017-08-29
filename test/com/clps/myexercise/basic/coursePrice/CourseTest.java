package com.clps.myexercise.basic.coursePrice;

import java.util.Arrays;

import org.junit.Test;

import com.clps.myexercise.basic.coursePrice.Course;

public class CourseTest {

	@Test
	public void test() {
		Course course0=new Course(3,"数学");
		Course course1=new Course(1,"计算机");
		Course course2=new Course(2, "英语");
		Course course3=new Course(1, "统计");
		
		Course[] courses={course1,course2,course0,course3};
		Arrays.sort(courses);
		for (Course course : courses) {
			System.out.println(course);
		}
	}

}
