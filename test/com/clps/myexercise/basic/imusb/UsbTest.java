package com.clps.myexercise.basic.imusb;

import org.junit.Test;

import com.clps.myexercise.basic.imusb.impl.PhoneUsbImpl;

public class UsbTest {

	@Test
	public void test() {
		PhoneUsbImpl phone=new PhoneUsbImpl();
				phone.dataTrans();
				phone.supplyPower();
	}

}
