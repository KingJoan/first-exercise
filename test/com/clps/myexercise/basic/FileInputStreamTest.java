package com.clps.myexercise.basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class FileInputStreamTest {

	@Test
	public void test() {
		
		try {
			File file=new File("E:\\text.txt");
			System.out.println(file.exists());
			FileInputStream fis=new FileInputStream(file);
			int num=fis.read();
			while (num!=-1) {
				System.out.println((char)(num));
				num=fis.read();
			}
			
			byte[] buf=new byte[(int)(file.length())];
			fis.read(buf);
			String str=new String(buf);
			System.out.println(str);
			System.out.println();
			fis.close();
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("文件打开失败。");
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
