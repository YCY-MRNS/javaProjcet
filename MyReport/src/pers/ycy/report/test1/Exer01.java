package pers.ycy.report.test1;

public class Exer01 {
	public static void main(String[] args) {
		int sum = 0;
		int x = 1;
		for (int i = 1; i <= 10; i++) {
			x = x * i;
			sum = sum + x;
		}
		System.out.println("1!+2!+…+10!="+sum);
		second();

	}
    //第二种方法
	public static void second() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			int x = 1;
			for (int j = 1; j <= i; j++) {
				x *= j;
			}
			sum += x;
		}
		System.out.println("1!+2!+…+10!="+sum);
	}


}
