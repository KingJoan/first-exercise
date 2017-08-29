package com.clps.myexercise.basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:\\text.txt");
		try {
			FileOutputStream fos = new FileOutputStream(file, true);// 追加
			String str = "1234abjsd张三李四";
			fos.write(str.getBytes());
			System.out.println("写入成功");
			// fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("文件不存在！");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File file1=new File("E:\\text1.txt");
		if (!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			FileInputStream is=new FileInputStream(file);
			FileOutputStream os=new FileOutputStream(file1);
			/*int len=is.read();
			while (len!=-1) {
				os.write(len);
				len=is.read();
			}*/
			byte[] buff=new byte[(int) file.length()];
			is.read(buff);
			os.write(buff);
			System.out.println("复制成功");
			is.close();
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
