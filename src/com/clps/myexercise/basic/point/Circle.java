package com.clps.myexercise.basic.point;

public class Circle extends Point{
	protected float Radius;
	String name;
	public Circle(){
		super();
	}
	public Circle(float x,float y,float Radius) {
		super(x, y);
		this.Radius=Radius;
	}
	
	public float getRadius() {
		return Radius;
	}

	public void setRadius(float radius) {
		Radius = radius;
	}

	public double area() {
		return Math.PI*Radius*Radius;
	}
	public String value() {
		 return super.value();
	}
}
