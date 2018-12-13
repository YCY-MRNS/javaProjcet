package pers.ycy.report.test4;

import java.io.Serializable;

public class PhoneNum implements Serializable {
	
	public String name;
	public String Sex;
	public String num;

	public PhoneNum(String name, String sex, String num) {
		super();
		this.name = name;
		Sex = sex;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Override
	public String toString() {
//		return "������" + name + "\n" + "�Ա�" + Sex + "\n" + "�绰���룺" + num + "\n";
		return "������" + name + "   " + "�Ա�" + Sex + "   " + "�绰���룺" + num + " ";
	}

}
