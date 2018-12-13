package pers.ycy.report.test4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class Program4 {
	public static void main(String[] args) throws Exception {

		LinkedList<PhoneNum> list = new LinkedList<>();

		// 添加到通讯录java对象的集合中去
		addNum(list, "李四", "男", "18166334763");
		addNum(list, "张三", "女", "15199827265");
		addNum(list, "王五", "男", "15199827265");

		// 将对象内容写入到文件中去
		writeToFile(list);

		// 读取原始通讯录数据
		System.out.println("---以下是原始通讯录数据---" + "\n");
		readAddress(list);

		// 根据姓名修改通讯录信息
		System.out.println("\n" + "---以下是修改后的通讯录数据---" + "\n");
		upDataAddress(list, "张三", "123");

		// 根据姓名删除通讯录信息
		System.out.println("\n" + "---以下是删除后的通讯录数据---" + "\n");
		deleteAddress(list, "张三");

		// 根据姓名查询通讯录信息
		System.out.println("\n" + "---以下是查询的通讯录数据---" + "\n");
		queryAddress(list, "李四");
	}

	public static PhoneNum addNum(LinkedList<PhoneNum> list, String name, String sex, String number) {
		PhoneNum num = new PhoneNum(name, sex, number);
		list.add(num);
		return num;
	}

	public static void readAddress(LinkedList<PhoneNum> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

	public static void writeToFile(LinkedList<PhoneNum> list) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:\\test2.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		// 创建输出流对象 可以实现将对象的内容写到文件中去
		oos.writeObject(list);
	}

	public static void upDataAddress(LinkedList<PhoneNum> list, String name, String num) throws Exception {

		FileInputStream fis = new FileInputStream("C:\\test2.txt");
		// 创建输入流对象 了可以实现读取文件内容
		ObjectInputStream ois = new ObjectInputStream(fis);
		LinkedList<PhoneNum> list2 = (LinkedList<PhoneNum>) ois.readObject();

		for (int i = 0; i < list2.size(); i++) {
			if (list2.get(i).getName().equals(name)) {
				list2.get(i).setNum(num);
				System.out.println(list2.get(i).getName() + "的号码已经更新为" + num + "!" + "\n");
			}

		}

		readAddress(list2);
		// 变化后的数据重新存到文件中
		writeToFile(list2);

	}

	public static void deleteAddress(LinkedList<PhoneNum> list, String name) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\test2.txt");
		// 创建输入流对象 了可以实现读取文件内容
		ObjectInputStream ois = new ObjectInputStream(fis);
		LinkedList<PhoneNum> list2 = (LinkedList<PhoneNum>) ois.readObject();

		for (int i = 0; i < list2.size(); i++) {
			if (list2.get(i).getName().equals(name)) {
				System.out.println(list2.get(i).getName() + "的号码已经删除!" + "\n");
				list2.remove(list2.get(i));
			}

		}

		readAddress(list2);
		// 变化后的数据重新存到文件中
		writeToFile(list2);

	}

	public static void queryAddress(LinkedList<PhoneNum> list, String name) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\test2.txt");
		// 创建输入流对象 了可以实现读取文件内容
		ObjectInputStream ois = new ObjectInputStream(fis);
		LinkedList<PhoneNum> list2 = (LinkedList<PhoneNum>) ois.readObject();
		for (PhoneNum phoneNum : list2) {
			if (phoneNum.getName().equals(name)) {
				System.out.println(phoneNum.toString());
			}

		}
		// 变化后的数据重新存到文件中
		writeToFile(list2);

	}
}
