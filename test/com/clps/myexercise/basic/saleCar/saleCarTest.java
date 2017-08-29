package com.clps.myexercise.basic.saleCar;

import org.junit.Test;

public class saleCarTest {

	@Test
	public void test() {
		SalePerson salePerson=new SalePerson("王五");
		Car car=new Car("凯越", 3);
		System.out.println(salePerson.sale(5));
		System.out.println(salePerson.sale(5, car.getType()));
		System.out.println(salePerson.getName()+"销售了"+salePerson.sale(car));
	}

}
