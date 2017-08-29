package com.clps.myexercise.basic.bank;

import org.junit.Test;

public class BankAccountBizTest {

	@Test
	public void test() {
		BankAccountBiz bankAccountBiz=new BankAccountBiz();
		bankAccountBiz.saveMoney(500);
		bankAccountBiz.getMoney(6000);
		bankAccountBiz.showMoney();
	}

}
