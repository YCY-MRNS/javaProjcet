package pres.ycy.report.test3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		getNum(new Scanner(System.in).next());

	}

	// 获取字符串中的数字
	private static void getNum(String aString) {

		if (hasNum(aString)) {
			aString = aString.trim();
			String aString2 = "";
			if (aString != null && !"".equals(aString)) {
				for (int i = 0; i < aString.length(); i++) {
					if (aString.charAt(i) >= 48 && aString.charAt(i) <= 57) {
						aString2 += aString.charAt(i);
					}
				}
			}

			System.out.println(aString2);

		} else {

			System.out.println("该字符串没有数字");

		}

	}

	// 判断是否存在数字，利用正则表达式。
	public static boolean hasNum(String aString) {

		boolean flag = false;
		Pattern pattern = Pattern.compile(".*\\d+.*");
		Matcher matcher = pattern.matcher(aString);
		if (matcher.matches()) {
			flag = true;
		}
		return flag;

	}

}
