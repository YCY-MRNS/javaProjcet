package pers.ycy.report.test2.title5;

public class Mic implements USB {
	@Override
	public void turnOn() {
		System.out.println("键盘启动了......");
	}
	@Override
	public void turnOff() {
		System.out.println("键盘关闭了......");
	}

}
