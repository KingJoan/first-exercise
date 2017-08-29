package com.clps.myexercise.basic;

public class StringChackTest {
		String s;
		public StringChackTest(String s){
			this.s=s;
		}
		public void show(){
			int count=0;
			String[] s1=s.split("@");
			for(int i=0;i<s1.length;i++){
				String[] s2=s1[i].split("#");
					for (int j = 0; j < s2.length; j++) {
						if (j==0) {
							System.out.print("学号："+s2[j]);
						}else if(j==1){
							System.out.print("姓名："+s2[j]);
						}else {
							System.out.print("分数："+s2[j]);
							count+=Integer.parseInt(s2[j]);
						}
					}
					System.out.println();			
			}
			System.out.println("总分："+count);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringChackTest s=new StringChackTest("01#张三#20@02#李四#30@03#王五#40");
		s.show();
		
	}

}
