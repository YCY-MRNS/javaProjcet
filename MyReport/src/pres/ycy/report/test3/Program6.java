package pres.ycy.report.test3;

import java.util.Random;

public class Program6 {
	public static void main(String[] args) {

		String all = "1234567890qazwsxedcrfvtgbyhnujmkilopQAZXSWEDCRFVGTBNHYUJMKIOLP";
		Random random = new Random();
		StringBuffer s = new StringBuffer();
		System.out.println("---以下为随机生成的4位验证码（大写小写数字）---" );
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 4; i++) {
				s.append(all.charAt(random.nextInt(52)) + "");
			}
			System.out.println(s.toString());
			s=new StringBuffer();
		}
	}
	
}
