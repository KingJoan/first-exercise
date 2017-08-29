package com.clps.myexercise.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileBuffer {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File srcFile=new File("E:\\src.txt");
		File destFile=new File("E:\\dest.txt");
		if (!destFile.exists()) {
			destFile.createNewFile();
		}
		
		FileReader fr=new FileReader(srcFile);
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw=new FileWriter(destFile);
		BufferedWriter bw=new BufferedWriter(fw);
		
		String msg=br.readLine();
		while (msg!=null) {
			bw.write(msg);
			System.out.println(msg);
			bw.newLine();
			msg=br.readLine();
		}
		System.out.println("复制成功");
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}

}
