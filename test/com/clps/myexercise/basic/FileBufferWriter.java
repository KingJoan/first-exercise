package com.clps.myexercise.basic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("E:\\src.txt");
		try {
			FileWriter fw=new FileWriter(file);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("welcome");
			bw.write("studying");
			bw.newLine();
			bw.write("help me");
			
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
