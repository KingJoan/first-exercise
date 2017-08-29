package com.clps.myexercise.basic.employee;

public class Manager extends Employee{
	public String department;
	public Manager(String name,float basic,String address,String department){
		super(name,basic,address);
		this.department=department;
	}
}
