package pers.ycy.report.test1;

import java.util.Scanner;

public class Exer03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		if (m==1||m==3||m==5||m==7||m==8||m==10||m==12) {
			System.out.println("该月份有31天");
		}else if(m==2){
			System.out.println("该月份有28/29天");
		}else{
			System.out.println("该月份有30天");
		}
	}
}
