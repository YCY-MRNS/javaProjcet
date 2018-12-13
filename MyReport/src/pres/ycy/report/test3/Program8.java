package pres.ycy.report.test3;

public class Program8 {
	public static void main(String[] args) {
		
		
		System.out.println("---以下是将英语句子中的每个单词首字母大写---");
		String aString = "i love you so much !";
		String[] aStrings = aString.split(" ");
		for(int i=0;i<aStrings.length;i++){
			aStrings[i]  = Character.toUpperCase(aStrings[i].charAt(0))+aStrings[i].substring(1);
		    System.out.print(aStrings[i].toString()+" ");
		}
		
	

	}

}
