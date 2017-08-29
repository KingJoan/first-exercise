package com.clps.myexercise.basic.courseName;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * 
 * @author dell
 *
 * 2017年8月24日 下午1:03:46
 * 
 * @since 1.0
 */
public class CourseNameTest {
	public static void  main(String[] args) {
		Map<Integer, String> list=new HashMap<>();
		list.put(1, "java");
		list.put(2, "math");
		list.put(3, "English");
		System.out.println("请输入课程代号（1~3之间的数字）：");
		Scanner input=new Scanner(System.in);
		int s=input.nextInt();
		switch (s) {
		case 1:
			System.out.println(list.get(1));
			break;
		case 2:
			System.out.println(list.get(2));
			break;
		case 3:
			System.out.println(list.get(3));	
			break;
		default:
			System.out.println("输入错误！");
			break;
		}
		System.out.println("欢迎提出建议！");
		
		
		System.out.println("*******************");
		//判断指定字符在已知字符中出现的次数
		String str="this is a problem a is this problem that";
		//String[] strs=str.split(" ");
		
		int count=0;
		for(int i=0;i<str.length();i++){
		String ch=str.substring(i, i+1);
			if(ch.equals("that")){
				count ++;
		}
		}
		System.out.println(count);
	}
}
