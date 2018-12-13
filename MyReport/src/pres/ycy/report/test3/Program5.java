package pres.ycy.report.test3;

import java.util.Random;

public class Program5 {
	public static void main(String[] args) {
		Random random = new Random();
		String result = "15923";
		System.out.println("---以下为开头15923后六位随机生成的电话号码---" + "\n");
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 6; i++) {
				result += random.nextInt(10);
			}
			System.out.println(result);
			result = "15923";
		}

	}

}
