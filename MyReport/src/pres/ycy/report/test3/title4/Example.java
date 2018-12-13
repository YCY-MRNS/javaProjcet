package pres.ycy.report.test3.title4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class Example {

	public static void main(String[] args) {
		LinkedList<Student> students = new LinkedList<>();

		students.add(new Student(201644001, "张三", "1997年02月03日"));
		students.add(new Student(201644002, "李四", "1998年11月11日"));
		students.add(new Student(201644003, "王五", "1996年03月02日"));
		students.add(new Student(201644004, "赵六", "1996年12月12日"));
		students.add(new Student(201644005, "周正", "1997年10月10日"));

		// 第一次输出List
		printAll(students);

		// 插入新学生
		addNew(students);

		// 删除学生
		deleteStudent(students, "王五");

		// 第二次输出List
		showAll(students);

		// 比较时间
		compareData(students);

	}

	public static void addNew(LinkedList<Student> students) {
		students.add(new Student(201644008, "李明", "1991年01月01日"));
		System.out.println("---成功添加李明！---" + "\n");
	}

	public static void compareData(LinkedList<Student> students) {

		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
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
		System.out.println("---年龄最小的学生的信息如下---");
		System.out.println(students.get(id).toString());

	}

	public static void deleteStudent(LinkedList<Student> students, String string) {
		for (int i = 0; i < students.size(); i++) {
			Student s = students.get(i);
			if (s.getName().equals(string)) {
				students.remove(i);
			}
		}
		System.out.println("---成功删除王五！---" + "\n");

	}

	public static void printAll(LinkedList<Student> students) {
		System.out.println("---以下第一次输出全部列表---" );
		Iterator<Student> it = students.iterator();
		while (it.hasNext()) {
			Student student = it.next();
			System.out.println(student.toString());

		}
		System.out.println();
		
	}

	public static void showAll(LinkedList<Student> students) {
		System.out.println("---以下第二次输出全部列表---" );
		for (Student student : students) {
			System.out.println(student.toString());
		}
		System.out.println();
	}
}
