package com.clps.myexercise.basic.imusb.impl;

import com.clps.myexercise.basic.imusb.Usb;

public class PhoneUsbImpl implements Usb {

	@Override
	public void supplyPower() {
		// TODO Auto-generated method stub
		System.out.println("手机充电开始。。。");
		System.out.println("手机充电结束。。。");
	}

	@Override
	public void dataTrans() {
		// TODO Auto-generated method stub
		System.out.println("数据传输开始。。。");
		System.out.println("数据传输结束。。。");
	}

}
