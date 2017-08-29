package com.clps.myexercise.basic.goods;

import org.junit.Test;

public class ProductTest {

	@Test
	public void test() {
		Reposite reposite=new Reposite();
		
		Product product[]=new Product[3];
		product[0]=new Product(1,"电视",2100f,100);
		product[1]=new Product(2,"杯子",20f,522);
		product[2]=new Product(3,"MP3",45f,235);
		
		reposite.add(1, product[0]);
		reposite.add(2, product[1]);
		reposite.add(3, product[2]);
		reposite.out(1);
		
		for(Integer integer :reposite.list.keySet()){
			Product p=reposite.list.get(integer);
			
			p.show();
		}
	}

}
