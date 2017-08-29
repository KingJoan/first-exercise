package com.clps.myexercise.basic.proConCake;

public class Producer implements Runnable{
	private Cake cake;

	public Producer(Cake cake) {
		this.cake = cake;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			cake.set("奶油蛋糕");
		}
	}
	
}
