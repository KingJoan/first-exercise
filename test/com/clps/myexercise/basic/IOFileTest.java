package com.clps.myexercise.basic;

import java.io.File;
import java.io.IOException;

public class IOFileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("E:\\train.text");
		System.out.println(file.exists());
		if (file.exists()) {
			System.out.println("文件或目录是否存在："+file.exists());
		}else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("是文件吗："+file.isFile());
		System.out.println("是目录吗："+file.isDirectory());
		System.out.println("名称："+file.getName());
		System.out.println("绝对路径："+file.getAbsolutePath());
		System.out.println("文件大小："+file.length());
		
		File file2=new File("E:\\train");
		if (!file2.exists()) {
			file2.mkdir();
			System.out.println("文件创建成功");
		}
		File[] fileList=file2.listFiles();
		for (File f : fileList) {
			System.out.println(f.getAbsolutePath());
		}
		
		File file3=new File(new File("E:\\train").getPath(), "zhang1.test");
		try {
			file3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(file2.exists());
	}

}
