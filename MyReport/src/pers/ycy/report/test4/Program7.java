package pers.ycy.report.test4;

import java.io.*;
import java.util.LinkedList;

public class Program7 {

	public static void main(String[] args) throws Exception {
		LinkedList<Student> list = new LinkedList<>();
		list.add(new Student(201644001, "����", "1997��2��3��"));
		list.add(new Student(201644002, "����", "1998��11��11��"));
		list.add(new Student(201644003, "����", "1996��3��2��"));
		list.add(new Student(201644004, "����", "1996��12��12��"));
		list.add(new Student(201644005, "����", "1997��10��10��"));
		
		System.out.println("�Ѿ�������Student������д�뵽student.txt�У�" + "\n");
		FileOutputStream foi = new FileOutputStream("C:\\student.txt");
		ObjectOutputStream oos = new ObjectOutputStream(foi);
		oos.writeObject(list);
		
		System.out.println("---�����Ƕ����ļ�Student����Ϣ---" + "\n");
		FileInputStream fis = new FileInputStream("C:\\\\student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		LinkedList<Student> list2=(LinkedList<Student>) ois.readObject();
		for (Student student : list2) {
			System.out.println(student.toString());
		}
		
	}

}
