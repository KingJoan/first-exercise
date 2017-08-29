package com.clps.myexercise.basic.lang;

public class LangTest {
	public static void main(String[] agrgs) {
		int num=20;
		Integer num1=new Integer(num);
		Integer objint=new Integer(100);
		
		Boolean objBool=new Boolean(true);
		Character objChar=new Character('d');
		
		Long objLong=new Long(2568);
		Double objDou=new Double(3.1415);
		
		System.out.println(num1);
		System.out.println(objint);
		System.out.println(objBool);
		System.out.println(objChar);
		System.out.println(objLong);
		System.out.println(objDou);
		
		System.out.println("----------------");
		
		String str="120";
		
		Byte objByte=Byte.valueOf(str);
		Short objShort=Short.valueOf(str);
		Integer objInt=Integer.valueOf(str);
		Long objLang=Long.valueOf(str);

		
		System.out.println(objByte);
		System.out.println(objShort);
		System.out.println(objInt);
		System.out.println(objLang);
		
		System.out.println("**************");
		
		String string="123";
		
		int i=Integer.parseInt(string);
		short s=Short.parseShort(string);
		byte b=Byte.parseByte(string);
		long l=Long.parseLong(string);
		float f=Float.parseFloat(string);
		Double d=Double.parseDouble(string);
		
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);;
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		System.out.println("-------------");
		String st1="Joan King";
		String st2=new String("I love java");
		System.out.println(st1.length());
		System.out.println(st2.length());
		
		System.out.println("************");
		
		String strEmial="java@sun.com";
		int index;
		System.out.println(strEmial);
		index=strEmial.indexOf("@");
		System.out.println(index);
		
		index=strEmial.lastIndexOf("a");
		System.out.println(index);
		
		String strg="/dgh/sdg/hd/j";
		System.out.println(strg.toUpperCase());
		String[] strs=strg.split("/");
		for (int j = 0; j < strs.length; j++) {
			System.out.println(strs[j]);
		}
		byte[] strB=strg.getBytes();
		for (int j = 0; j < strB.length; j++) {
			System.out.println(strB[j]);
		}
		System.out.println(strg.toCharArray());
	}
}
