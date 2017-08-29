package com.clps.myexercise.basic.petFood;

import java.util.Scanner;

import org.junit.Test;

public class PetFoodTest {

	@Test
	public void test() {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入饲养员的名字：");
		String masterName=input.nextLine();
		Master master=new Master(masterName);
		Pet pet=null;
		System.out.println("请选择喂养的宠物（1.狗 2.猫）：");
		String sel=input.nextLine();
		if (sel.equals("1")) {
			System.out.println("请输入狗的名字：");
			String petName=input.nextLine();
			System.out.println("请输入狗的类型：");
			String type=input.nextLine();
			pet=new Dog(petName,type);
			System.out.println("请输入食物的名字：");
			String foodName=input.nextLine();
			Food food=new Food(foodName);
			master.feed(pet, food);
		}else if(sel.equals("2")){
			System.out.println("请输入猫的名字：");
			String petName=input.nextLine();
			System.out.println("请输入猫的性别：");
			String sex=input.nextLine();
			pet=new Cat(petName, sex);
			System.out.println("请输入食物的名字：");
			String foodName=input.nextLine();
			Food food=new Food(foodName);
			master.feed(pet, food);
		}
	}

}
