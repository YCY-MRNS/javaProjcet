package pres.ycy.report.test3;

public class Program3 {
	public static void main(String[] args) {

		String str = "I love Java";
		char[] ch = str.toCharArray();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				buffer.append(String.valueOf(ch[i]).toLowerCase());
			} else if (ch[i] >= 'a' && ch[i] <= 'z') {
				buffer.append(String.valueOf(ch[i]).toUpperCase());
			}
		}
		System.out.println(buffer.toString());

	}

}
