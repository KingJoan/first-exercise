package com.clps.myexercise.basic;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new BoilThread()).start();
		new Thread(new WashThread()).start();
		}

}
class BoilThread implements Runnable{
	public void run() {
		try {
			System.out.println("开始烧水");
			Thread.sleep(10000);
			System.out.println("水烧开了");
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

class WashThread implements Runnable{
	public void run() {
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println("开始洗第"+i+"个杯子");
				Thread.sleep(1500);
				System.out.println("第"+i+"个杯子洗干净了");
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
