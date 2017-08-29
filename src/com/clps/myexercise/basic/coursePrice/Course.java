package com.clps.myexercise.basic.coursePrice;

public class Course implements Comparable<Course>{
	private int price;
	private String name;
	public Course(int price,String name){
		this.name=name;
		this.price=price;
	}
	@Override
	public int compareTo(Course course) {
		// TODO Auto-generated method stub
		if(price>=course.price){
			return 1;
		}else if(price<=course.price){
			return -1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Course [price="+price+",name="+name+"]";
	}
	
	
}
