package pres.ycy.report.test3.title4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class Example {

	public static void main(String[] args) {
		LinkedList<Student> students = new LinkedList<>();

		students.add(new Student(201644001, "����", "1997��02��03��"));
		students.add(new Student(201644002, "����", "1998��11��11��"));
		students.add(new Student(201644003, "����", "1996��03��02��"));
		students.add(new Student(201644004, "����", "1996��12��12��"));
		students.add(new Student(201644005, "����", "1997��10��10��"));

		// ��һ�����List
		printAll(students);

		// ������ѧ��
		addNew(students);

		// ɾ��ѧ��
		deleteStudent(students, "����");

		// �ڶ������List
		showAll(students);

		// �Ƚ�ʱ��
		compareData(students);

	}

	public static void addNew(LinkedList<Student> students) {
		students.add(new Student(201644008, "����", "1991��01��01��"));
		System.out.println("---�ɹ����������---" + "\n");
	}

	public static void compareData(LinkedList<Student> students) {

		SimpleDateFormat format = new SimpleDateFormat("yyyy��MM��dd��");
		int id = 0;
		for (int i = 0; i < students.size() - 1; i++) {
			try {
				if (format.parse(students.get(i).getBrith()).getTime() <= format.parse(students.get(i + 1).getBrith())
						.getTime()) {

					id = i - 1;

				}
			} catch (ParseException e) {
				e.printStackTrace();
			}

		}
		System.out.println("---������С��ѧ������Ϣ����---");
		System.out.println(students.get(id).toString());

	}

	public static void deleteStudent(LinkedList<Student> students, String string) {
		for (int i = 0; i < students.size(); i++) {
			Student s = students.get(i);
			if (s.getName().equals(string)) {
				students.remove(i);
			}
		}
		System.out.println("---�ɹ�ɾ�����壡---" + "\n");

	}

	public static void printAll(LinkedList<Student> students) {
		System.out.println("---���µ�һ�����ȫ���б�---" );
		Iterator<Student> it = students.iterator();
		while (it.hasNext()) {
			Student student = it.next();
			System.out.println(student.toString());

		}
		System.out.println();
		
	}

	public static void showAll(LinkedList<Student> students) {
		System.out.println("---���µڶ������ȫ���б�---" );
		for (Student student : students) {
			System.out.println(student.toString());
		}
		System.out.println();
	}
}
