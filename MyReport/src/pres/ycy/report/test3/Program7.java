package pres.ycy.report.test3;

import java.util.Scanner;

public class Program7 {
	
	public static void main(String[] args) {
		System.out.println("�����������ʺţ�");
		String text = new Scanner(System.in).next();
		StringBuffer aBuffer = new StringBuffer();
		for (int i = 0; i < text.length() - 3; i += 4) {

			aBuffer.append(text.substring(i, i + 4) + " ");

		}
		//���ƴ�������λ
		System.out.println(aBuffer.append(text.substring(text.length() - 3, text.length())).toString());
		
	}
}
