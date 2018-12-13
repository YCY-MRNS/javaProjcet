
package pres.ycy.report.test3;

public class Program2 {
		
	public static void main(String[] args) {
		
		String b = "****";
		StringBuffer a = new StringBuffer("10013319961213602X");
		a.replace(6,10,b);
		System.out.println(a.toString());
		
	}
}
