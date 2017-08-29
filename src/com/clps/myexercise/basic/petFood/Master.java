package com.clps.myexercise.basic.petFood;

public class Master {
	private String masterName;
	
	public Master(String masterName) {
		super();
		this.masterName = masterName;
	}
	
	public String getMasterName() {
		return masterName;
	}

	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}

	public void feed(Pet pet,Food food) {
		System.out.println("饲养员：" + getMasterName()+"喂养" + pet.getPetName() + "吃了"+food.getFoodName());
	}
}
