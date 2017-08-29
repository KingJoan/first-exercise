package com.clps.myexercise.basic;

public class TicketThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IThread it=new IThread();
		Thread i1=new Thread(it);
		Thread i2=new Thread(it);
		i1.start();
		i2.start();

	}

}
class IThread implements Runnable{
	private int num=100;
	private Object obj=new Object();
	public  void run() {
		while (num>0) {
			//synchronized (this) ;synchronized (Thread.currentThread()) 
			synchronized (obj) {	
			
				System.out.println(Thread.currentThread()+"买票后，剩余"+num--);
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
