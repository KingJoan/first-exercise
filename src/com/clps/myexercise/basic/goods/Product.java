package com.clps.myexercise.basic.goods;

public class Product {
	private int pid;
	private String pname;
	private float price;
	private int count;
	
	
	public Product(int pid, String pname, float price, int count) {
		
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.count = count;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}	
	public void show(){
		System.out.println(pid+" "+pname+" "+price+" "+count);
	}
	
}
