package pers.ycy.report.test4;

import java.io.Serializable;

public class Student implements Serializable {

	private int Id;
	private String name;
	private String born;

	public Student(int id, String name, String born) {
		super();
		Id = id;
		this.name = name;
		this.born = born;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBorn() {
		return born;
	}

	public void setBorn(String born) {
		this.born = born;
	}

	@Override
	public String toString() {
		return Id + " " + name + " " + born;
	}

}
