package pers.ycy.report.test4;

import java.io.*;
import java.util.LinkedList;

public class Program7 {

	public static void main(String[] args) throws Exception {
		LinkedList<Student> list = new LinkedList<>();
		list.add(new Student(201644001, "张三", "1997年2月3日"));
		list.add(new Student(201644002, "李四", "1998年11月11日"));
		list.add(new Student(201644003, "王五", "1996年3月2日"));
		list.add(new Student(201644004, "赵六", "1996年12月12日"));
		list.add(new Student(201644005, "周正", "1997年10月10日"));
		
		System.out.println("已经将对象Student的数据写入到student.txt中！" + "\n");
		FileOutputStream foi = new FileOutputStream("C:\\student.txt");
		ObjectOutputStream oos = new ObjectOutputStream(foi);
		oos.writeObject(list);
		
		System.out.println("---以下是读入文件Student的信息---" + "\n");
		FileInputStream fis = new FileInputStream("C:\\\\student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		LinkedList<Student> list2=(LinkedList<Student>) ois.readObject();
		for (Student student : list2) {
			System.out.println(student.toString());
		}
		
	}

}
