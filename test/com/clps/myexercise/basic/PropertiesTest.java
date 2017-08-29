package com.clps.myexercise.basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties props=new Properties();
		File file=new File("test.properties");
		if (!file.exists()) {
				file.createNewFile();	
		}
		FileOutputStream fos=new FileOutputStream(file, true);
		props.setProperty("name", "zhangsan");
		props.setProperty("password", "123");
		props.store(fos, null);
		fos.close();
		FileInputStream fis=new FileInputStream(file);
		props.load(fis);
		String name=props.getProperty("name");
		String password=props.getProperty("password");
		System.out.println("name="+name);
		System.out.println("password="+password);
		fis.close();
	}

}
