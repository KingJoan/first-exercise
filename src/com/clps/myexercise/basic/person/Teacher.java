package com.clps.myexercise.basic.person;

public class Teacher extends Person{
	public float Salary;
	public void prelection(){
		System.out.println("上课很累...");
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	
}
