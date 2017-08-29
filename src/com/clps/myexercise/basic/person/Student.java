package com.clps.myexercise.basic.person;

public class Student extends Person{
	public float Grade;
	public void examination() {
		System.out.println("考试及格了...");
	}
	public float getGrade() {
		return Grade;
	}
	public void setGrade(float grade) {
		Grade = grade;
	}
	
}
