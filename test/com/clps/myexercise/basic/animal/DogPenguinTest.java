package com.clps.myexercise.basic.animal;

import java.util.Scanner;

import org.junit.Test;

public class DogPenguinTest {

	@Test
	public void test() {
		Dog dog=new Dog();
		Penguin penguin=new Penguin();
		Scanner input=new Scanner(System.in);
		System.out.println("***欢迎来到宠物店！***");
		System.out.println("请选择动物（1.狗 2.企鹅）：");
		int sel1=input.nextInt();
		if(sel1==1){
			dog.setName("dog");
			System.out.println("请输入狗的类别：");
			String sel2=input.next();
			dog.setStrain(sel2);
			System.out.println("请输入亲密度：");
			int sel3=input.nextInt();
			dog.setLove(sel3);
			while(true){
				System.out.println("请输入健康值：");
				dog.setHealth(input.nextInt());
				if (dog.getHealth()>=0&&dog.getHealth()<=100) {
					break;
				}else{
					System.out.println("请输入正确的健康值！！！");
				}
			}
			dog.print();
		}else{
			penguin.setName("penguin");
			System.out.println("请选择企鹅的性别（1.Q仔 2.Q妹）：");
			int sel4=input.nextInt();
			switch (sel4) {
			case 1:
				penguin.setSex(penguin.SEX_FAMALE);;
				break;
			case 2:
				penguin.setSex(penguin.SEX_MALE);
			default:
				break;
			}
			System.out.println("请输入亲密度：");
			int sel5=input.nextInt();
			penguin .setLove(sel5);
			while(true){
				System.out.println("请输入健康值：");
				penguin.setHealth(input.nextInt());
				if (penguin.getHealth()>=0&&penguin.getHealth()<=100) {
					break;
				}else{
					System.out.println("请输入正确的健康值！！！");
				}
			}
			penguin.print();
		}
		
		
		
		
		
	}

}
