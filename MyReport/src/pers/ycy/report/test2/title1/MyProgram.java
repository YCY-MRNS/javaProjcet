package pers.ycy.report.test2.title1;

public class MyProgram {
	private int data;
	private String str;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String toString() {
		return "MyProgram [data=" + data + ", str=" + str + "]";
	}

	public static void main(String[] args) {
		
		MyProgram myProgram = new MyProgram();
		myProgram.setData(20181011);
		myProgram.setStr("ΩÒÃÏ «2018-10-11∫≈£°");

		System.out.println("Data=" + myProgram.data);
		System.out.println("str=" + myProgram.str);

		System.out.println(""+myProgram.toString());
	}

}
