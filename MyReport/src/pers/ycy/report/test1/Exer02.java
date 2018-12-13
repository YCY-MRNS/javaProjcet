package pers.ycy.report.test1;

public class Exer02 {
	public static void main(String[] args) {
		
		for (int i = 65; i < 91; i++) {
			char s = (char) (i);
			if (i % 5 == 0) {

				System.out.print("\n");

			}
			System.out.print(i + " " + s + " ");

		}

	}
}
