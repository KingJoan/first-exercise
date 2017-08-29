package com.clps.myexercise.basic;

public class Manager {
	private String name;
	private String password;
	public Manager(String name,String password) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.password=password;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void show() {
		System.out.println("管理员的用户名是："+getName()+",密码是："+getPassword());
	}
}
