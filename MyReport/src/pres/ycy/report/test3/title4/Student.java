package pres.ycy.report.test3.title4;

public class Student {
	private int ID;
	private String name;
	private String brith;

	public Student(int iD, String name, String brith) {
		super();
		ID = iD;
		this.name = name;
		this.brith = brith;
	}

	public Student() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getBrith() {
		return brith;
	}

	public void setBrith(String brith) {
		this.brith = brith;
	}

	@Override
	public String toString() {
		return ID + " " + name + " " + brith;
	}

}
