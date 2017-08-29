package com.clps.myexercise.basic;
/**
 * 
 * @author dell
 *
 * 2017年8月27日 下午10:46:59
 * 
 * @since 1.0
 */
public class PriorityThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new MyThread());//自定义线程
		Thread t2=new Thread(new MyThread());//自定义线程
		Thread tm=Thread.currentThread();//获得当前线程：主线程
		t1.setName("t1");//设置线程名称
		t2.setName("t2");
		tm.setName("tm");
		
		t1.setPriority(Thread.MAX_PRIORITY);//设置线程优先级
		t2.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println(t1.getName()+"的优先级："+t1.getPriority());
		System.out.println(t2.getName()+"的优先级："+t2.getPriority());
		System.out.println(tm.getName()+"的优先级："+tm.getPriority());
		
		t1.start();
		t2.start();
		
		String strName=tm.getName();
		for (int i = 0; i < 50; i++) {
			System.out.println(strName+":"+i);
		}
	}

}
class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String strName=Thread.currentThread().getName();
		for (int i = 0; i < 50; i++) {
			System.out.println(strName+":"+i);
		}
	}
	
}
