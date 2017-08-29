package com.clps.myexercise.basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("E:\\text1.txt");
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String msg=br.readLine();
			while (msg!=null) {
				System.out.println(msg);
				msg=br.readLine();
			}
			br.close();
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
