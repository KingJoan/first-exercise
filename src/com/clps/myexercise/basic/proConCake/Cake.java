package com.clps.myexercise.basic.proConCake;

public class Cake {
	private String name;
	private boolean flag;
	public synchronized void set(String name) {
		if (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		int count=0;
		this.name=name;
		System.out.println("生产了一个蛋糕"+this.name+"-------"+(++count));
		flag=true;
		notify();
	}
	public synchronized void get() {
		if (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("消费者消费了一个蛋糕："+this.name);
		flag=false;
		notify();
	}
}
