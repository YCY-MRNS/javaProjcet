package pers.ycy.report.test2.title5;

public class KeyBoard implements USB {

	@Override
	public void turnOn() {
		System.out.println("麦克风启动了......");
	}
	@Override
	public void turnOff() {
		System.out.println("麦克风关闭了......");
	}

}
