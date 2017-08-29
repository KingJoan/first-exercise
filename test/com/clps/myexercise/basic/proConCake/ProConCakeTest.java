package com.clps.myexercise.basic.proConCake;

import org.junit.Test;

public class ProConCakeTest {

	@Test
	public void test() {
		
		Cake cake=new Cake();
		Producer pro=new Producer(cake);
		
		Consumer con=new Consumer(cake);
		new Thread(pro).start();;
		new Thread(con).start();
	}

}
