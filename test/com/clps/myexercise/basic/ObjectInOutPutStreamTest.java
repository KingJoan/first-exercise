package com.clps.myexercise.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ObjectInOutPutStreamTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Student s1=new Student(1,"s1");
		Student s2=new Student(1,"s2");
		Student s3=new Student(1,"s3");
		ArrayList<Student> list=new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		FileOutputStream fos=new FileOutputStream("E:\\student.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.writeObject(list);
		System.out.println("写入成功");
		fos.close();
		oos.close();
		
		FileInputStream fis=new FileInputStream("E:\\student.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		//读一个对象
		/*Student student11=(Student)ois.readObject();
		System.out.println(student11.getId()+student11.getName());*/
		//读一个对象集合
		List<Student> students=(List<Student>) ois.readObject();
		for (Student student : students) {
			System.out.println(student.getId()+student.getName());
		}
		System.out.println(students.size());
	}

}
class Student implements Serializable{
	private Integer id;
	private String name;
	public Student(Integer id,String name) {
		this.id=id;
		this.name=name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}