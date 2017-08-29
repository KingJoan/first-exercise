package com.clps.myexercise.basic.goods;

import java.util.HashMap;
import java.util.Map;


public class Reposite {
	Map<Integer,Product> list=new HashMap<>();
	public void add(int id,Product product){
		
		for(Integer i:list.keySet()){
			if(i==id){
				return ;
			}
		}
		list.put(id, product);
		}

	public void out(int id){
		
		list.remove(id);
		}
	}

