package com.clps.myexercise.basic.proConCake;

public class Consumer implements Runnable{
	private Cake cake;

	public Consumer(Cake cake) {
		this.cake = cake;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			cake.get();
		}
	}
	
}
