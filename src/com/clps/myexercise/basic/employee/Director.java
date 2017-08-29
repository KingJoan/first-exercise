package com.clps.myexercise.basic.employee;

public class Director extends Employee{
	public float transportAllowance;
	public Director(String name,float basic,String address,float transportAllowance){
		super(name,basic,address);
		this.transportAllowance=transportAllowance;
	}
}
