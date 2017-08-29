package com.clps.myexercise.basic;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();//获得当前的系统日期和时间
		System.out.println("今天的日期是："+date);
		
		long time=date.getTime();//获得毫秒数
		System.out.println("自1970年1月1日起以毫秒为单位的时间（GMT）："+time);
		//截取字符串中表示时间的部分
		String strDate=date.toString();//toString方法将Date对象转换为字符串并返回该字符串。转换为字符串才能获取
		String strTime=strDate.substring(11,(strDate.length()-4));
		System.out.println(strTime);
		strTime=strTime.substring(0, 8);
		System.out.println(strTime);
	}

}
