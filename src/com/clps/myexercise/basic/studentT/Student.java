package com.clps.myexercise.basic.studentT;

public class Student<T> {
	private String name;
	private T t;
	
	public Student(String name,T t){
		super();
		this.name=name;
		this.t=t;
	}
	
	public String getName(){
		return name;
	}
	
	public T getT(){
		return t;
	}
}
