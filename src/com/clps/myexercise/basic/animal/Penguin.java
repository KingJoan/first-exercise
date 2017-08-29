package com.clps.myexercise.basic.animal;

public class Penguin {
	private String name;
	private int health;
	private int love;
	private String sex;
	static final String SEX_MALE="Q仔";
	static final String SEX_FAMALE="Q妹";
	/*public Penguin(String name,int health,int love,String sex){
		this.name=name;
		this.health=health;
		this.love=love;
		this.sex=sex;
	}*/
	
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void print() {
		System.out.println("宠物的独白：");
		System.out.println("我的名字叫"+getName()+",健康值是"+getHealth()+",和主人的亲密度是"+getLove()+",性别是"+getSex());
	}
	public void  play() {
		System.out.println("penguin is palying!");
	}
	public void eat() {
		System.out.println("penguin is eating!");
	}
}
