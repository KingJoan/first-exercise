package com.clps.myexercise.basic;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class CalendarFormaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyy/mm/dd");
		String nowTime=sdf.format(date);
		System.out.println(nowTime);
		System.out.println("****************");
		SimpleDateFormat sdf2=new SimpleDateFormat("yyy年MM月dd日HH时mm分ss秒");
		String nowTime2=sdf2.format(date);
		System.out.println(nowTime2);
		System.out.println("*****************");
		SimpleDateFormat sdf3=new SimpleDateFormat("一年中的第D天一年中第w个星期一月中第W个星期在一天中k时");
		String nowTime3=sdf3.format(date);
		System.out.println(nowTime3);
		
		Random r1=new Random();
		Random r2=new Random();
		System.out.println(r1.nextInt());
		System.out.println(r2.nextInt());
		
		Random r3=new Random(10);
		Random r4=new Random(10);
		System.out.println(r3.nextInt());
		System.out.println(r4.nextInt());
	}

}
