package pres.ycy.report.test3;

public class Program8 {
	public static void main(String[] args) {
		
		
		System.out.println("---�����ǽ�Ӣ������е�ÿ����������ĸ��д---");
		String aString = "i love you so much !";
		String[] aStrings = aString.split(" ");
		for(int i=0;i<aStrings.length;i++){
			aStrings[i]  = Character.toUpperCase(aStrings[i].charAt(0))+aStrings[i].substring(1);
		    System.out.print(aStrings[i].toString()+" ");
		}
		
	

	}

}
