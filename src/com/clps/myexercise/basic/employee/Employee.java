package com.clps.myexercise.basic.employee;

public class Employee {
	protected String name;
	protected float basic;
	protected String address;
	public Employee(String name,float basic,String address){
		this.name=name;
		this.basic=basic;
		this.address=address;
	}
	public void show() {
		System.out.println("name:"+name+" basic:"+basic+" address"+address);
	}
}



















