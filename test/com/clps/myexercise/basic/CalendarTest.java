package com.clps.myexercise.basic;

import java.util.Date;
import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		//创建包含有当前系统时间的Calendar对象
		Calendar cal=Calendar.getInstance();
		//打印Calendar对象的各个组成部分的值
		System.out.println("当前系统的时间：");
		System.out.print(cal.get(Calendar.YEAR)+"年");
		System.out.print((cal.get(Calendar.MONTH)+1)+"月");
		System.out.print(cal.get(Calendar.DATE)+"日");
		System.out.print(cal.get(Calendar.HOUR)+":");
		System.out.print(cal.get(Calendar.MINUTE)+":");
		System.out.print(cal.get(Calendar.SECOND));
		System.out.println("  星期："+(cal.get(Calendar.DAY_OF_WEEK)-1));
		//将当前时间添加30分钟，然后显示日期和时间
		cal.add(Calendar.MINUTE, 30);
		Date date=cal.getTime();
		System.out.println("将当前时间添加30分钟后的时间："+date);
	}
}
