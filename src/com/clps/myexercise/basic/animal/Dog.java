package com.clps.myexercise.basic.animal;

public class Dog {
	private String name;
	private int health;
	private int love;
	private String strain;
	
	public Dog(){
		
	}
	public Dog(String name,int health,int love,String strain){
		this.name=name;
		this.health=health;
		this.love=love;
		this.strain=strain;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	public void print() {
		System.out.println("宠物的独白：");
		System.out.println("我的名字叫"+getName()+",健康值是"+getHealth()+",和主人的亲密度是"+getLove()+",性别是"+getStrain());
	}
	public void  play() {
		System.out.println("dog is palying!");
	}
	public void eat() {
		System.out.println("dog is eating!");
	}
}
