package pers.ycy.report.test2.title5;

public class Test {
	public static void main(String[] args) {
		// ʵ�������������
		Computer computer = new Computer();
		// �������������ꡢ��˷硢����
		computer.add(new Mouse());
		computer.add(new Mic());
		computer.add(new KeyBoard());

		// ���������
		computer.powerOn();
		// �رռ����
		computer.powerOff();
	}
}
