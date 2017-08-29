package com.clps.myexercise.basic;

import java.util.Scanner;

public class EmailTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入邮箱：");
		String s=input.nextLine();
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			String ch=s.substring(i, i+1);
			if (ch.contentEquals("@")) {
				count++;
			}
		}
		if (count>1) {
			System.out.println("邮箱只能含有一个@");
		}else if(count<1){
			System.out.println("邮箱必须包含一个@");
		}
		count=0;
		for (int i = 0; i < s.length(); i++) {
			String ch=s.substring(i,i+1);
			if (".".equals(ch)) {
				count++;
			}
		}
		if (count>1) {
			System.out.println("邮箱只能含有一个.");
		}else if(count<1){
			System.out.println("邮箱必须含有一个.");
		}
		int position1=s.indexOf("@");
		int position2=s.indexOf(".");
		if (position1==0) {
			System.out.println("@不能是第一位");
		}
		if (position2==s.length()-1) {
			System.out.println(".不能是最后一位");
		}
		if (position1>position2) {
			System.out.println("@在.之前");
		}
		if ((position1+1)==position2) {
			System.out.println("@不能与.相邻");
		}
		int len=s.length();
		String chFinal=s.substring(len-9,len);
		if (!("@sina.com".equals(chFinal))) {
			System.out.println("sina邮箱应当以@sina.com结尾");
		}
	}
}
