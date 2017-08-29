package com.clps.myexercise.basic.living.impl;

import com.clps.myexercise.basic.living.Animal;
import com.clps.myexercise.basic.living.Living;
import com.clps.myexercise.basic.living.People;

public class StudentLiving implements People, Animal, Living {

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("学生会呼吸");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("学生会吃饭");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("学生会睡觉");
	}

	@Override
	public void think() {
		// TODO Auto-generated method stub
		System.out.println("学生会思考");
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("学生会学习");
	}

}
