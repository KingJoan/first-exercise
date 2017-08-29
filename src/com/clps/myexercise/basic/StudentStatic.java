package com.clps.myexercise.basic;

public class StudentStatic {
	private String name;
	private int age;
	private float weight;
	
	public void dining() {
		System.out.println("吃饱了...");
		weight++;
	}
	static{
		System.out.println("我是静态块中的内容");
	}
}
