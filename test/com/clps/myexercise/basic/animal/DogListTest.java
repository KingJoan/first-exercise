package com.clps.myexercise.basic.animal;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

public class DogListTest {

	@Test
	public void test() {
		Dog dog1=new Dog("dog1",2,30,"a");
		Dog dog2=new Dog("dog2",25, 45, "b");
		ArrayList<Dog> list=new ArrayList<>();
		list.add(dog1);
		list.add(dog2);
		System.out.println(list.size());
		
			Iterator<Dog> iterator=list.iterator();
			for (int i = 0; i < list.size(); i++) {
				if(iterator.hasNext()){
					Dog dog=iterator.next();
					System.out.println(dog.getName()+" "+dog.getHealth()+" "+dog.getLove()+" "+dog.getStrain());
				}
			
			}
		
	}
}


