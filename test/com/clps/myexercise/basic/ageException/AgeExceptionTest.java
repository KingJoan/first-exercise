package com.clps.myexercise.basic.ageException;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class AgeExceptionTest {

	@Test
	public void test() throws AgeException{
		Scanner input=new Scanner(System.in);
		System.out.println("请输入您的年龄：");
		int age=input.nextInt();
		if(age>100||age<1){
			try{
				throw new AgeException("年龄必须在0-100之间");
			}catch (AgeException e) {
				// TODO: handle exception
				System.out.println("请输入正确的年龄！！！！");
			}
		}
	}

}
