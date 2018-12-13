package pers.ycy.report.test4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class Program4 {
	public static void main(String[] args) throws Exception {

		LinkedList<PhoneNum> list = new LinkedList<>();

		// ��ӵ�ͨѶ¼java����ļ�����ȥ
		addNum(list, "����", "��", "18166334763");
		addNum(list, "����", "Ů", "15199827265");
		addNum(list, "����", "��", "15199827265");

		// ����������д�뵽�ļ���ȥ
		writeToFile(list);

		// ��ȡԭʼͨѶ¼����
		System.out.println("---������ԭʼͨѶ¼����---" + "\n");
		readAddress(list);

		// ���������޸�ͨѶ¼��Ϣ
		System.out.println("\n" + "---�������޸ĺ��ͨѶ¼����---" + "\n");
		upDataAddress(list, "����", "123");

		// ��������ɾ��ͨѶ¼��Ϣ
		System.out.println("\n" + "---������ɾ�����ͨѶ¼����---" + "\n");
		deleteAddress(list, "����");

		// ����������ѯͨѶ¼��Ϣ
		System.out.println("\n" + "---�����ǲ�ѯ��ͨѶ¼����---" + "\n");
		queryAddress(list, "����");
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
		// ������������� ����ʵ�ֽ����������д���ļ���ȥ
		oos.writeObject(list);
	}

	public static void upDataAddress(LinkedList<PhoneNum> list, String name, String num) throws Exception {

		FileInputStream fis = new FileInputStream("C:\\test2.txt");
		// �������������� �˿���ʵ�ֶ�ȡ�ļ�����
		ObjectInputStream ois = new ObjectInputStream(fis);
		LinkedList<PhoneNum> list2 = (LinkedList<PhoneNum>) ois.readObject();

		for (int i = 0; i < list2.size(); i++) {
			if (list2.get(i).getName().equals(name)) {
				list2.get(i).setNum(num);
				System.out.println(list2.get(i).getName() + "�ĺ����Ѿ�����Ϊ" + num + "!" + "\n");
			}

		}

		readAddress(list2);
		// �仯����������´浽�ļ���
		writeToFile(list2);

	}

	public static void deleteAddress(LinkedList<PhoneNum> list, String name) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\test2.txt");
		// �������������� �˿���ʵ�ֶ�ȡ�ļ�����
		ObjectInputStream ois = new ObjectInputStream(fis);
		LinkedList<PhoneNum> list2 = (LinkedList<PhoneNum>) ois.readObject();

		for (int i = 0; i < list2.size(); i++) {
			if (list2.get(i).getName().equals(name)) {
				System.out.println(list2.get(i).getName() + "�ĺ����Ѿ�ɾ��!" + "\n");
				list2.remove(list2.get(i));
			}

		}

		readAddress(list2);
		// �仯����������´浽�ļ���
		writeToFile(list2);

	}

	public static void queryAddress(LinkedList<PhoneNum> list, String name) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\test2.txt");
		// �������������� �˿���ʵ�ֶ�ȡ�ļ�����
		ObjectInputStream ois = new ObjectInputStream(fis);
		LinkedList<PhoneNum> list2 = (LinkedList<PhoneNum>) ois.readObject();
		for (PhoneNum phoneNum : list2) {
			if (phoneNum.getName().equals(name)) {
				System.out.println(phoneNum.toString());
			}

		}
		// �仯����������´浽�ļ���
		writeToFile(list2);

	}
}
