package pers.ycy.report.test1;



public class Exer04 {
	public static void main(String[] args) {
		
		int m = 20;
		int x = m / 2 + 1;
		int y = m / 2;

		for (int i = 0; i < x; i++) {

			for (int j = (x - i); j > 0; j--)
				System.out.print(" ");

			for (int k = 2 * i - 1; k > 0; k--)
				System.out.print("*");
			
			System.out.println();

		}
		
		for (int i = y; i >0; i--) {

			for (int j = (x - i); j > 0; j--)
				System.out.print(" ");

			for (int k = 2 * i - 1; k > 0; k--)
				System.out.print("*");
			
			System.out.println();

		}
		
		
	}
}
