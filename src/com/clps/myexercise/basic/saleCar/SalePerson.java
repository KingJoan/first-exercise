package com.clps.myexercise.basic.saleCar;

public class SalePerson {
	private String name;
	public SalePerson(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String sale(int num) {
		return getName()+"销售了"+num+"辆车";
	}
	public String sale(int num,String type) {
		return getName()+"销售了"+type + num+"辆车";
	}
	public String sale(Car car) {
		return car.getType()+"编号为"+car.getId()+"的车";
		
	}
}
