package com.clps.myexercise.basic.person;

public class Person {
	protected String Name;
	protected int Age;
	public void dining() {
		System.out.println("吃饱了");
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
}
