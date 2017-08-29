package com.clps.myexercise.basic.bank;

public class BankAccountBiz {
	private float money=5000;
	
	public float saveMoney(float num){
		return money+=num;
	}
	public void getMoney(float num){
		if(money>num){
		 money-=num;
		}else{
			
			System.out.println("余额不足！");
		}
	}
	public void showMoney() {
		System.out.println("余额为："+money);
	}
}
