package com.clps.myexercise.basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	/*
	 * FileReader 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("E:\\text.txt");
		try {
			FileReader fr=new FileReader(file);
			//方式一
			int num=fr.read();
			System.out.println(num);
			System.out.println((char)(num));
			
			//方式二
			/*char[] chs=new char[1024];
			fr.read(chs);
			for (char c : chs) {
				System.out.println(c);
			}*/
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("文件不存在");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
