package com.clps.myexercise.basic.saleCar;

public class Car {
	private String type;
	private int id;
	public Car(String type,int id){
		this.type=type;
		this.id=id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
