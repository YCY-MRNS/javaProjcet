package pers.ycy.report.test4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) throws IOException {
		// �ж�д����ļ��Ƿ���ڣ�����FileWriter��
		FileReader fr = new FileReader("I:/java/MyReport/test.txt");
		FileWriter fw = new FileWriter(judgeFile("C:/test2.txt"));
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String s;
		while ((s=br.readLine())!=null) {
			//�������µ��ļ���ȥ
			bw.write("Tiele_3_"+s);
			
		}
		System.out.println("�Ѿ��������µ��ļ���ȥ��");
		
		bw.flush();
		br.close();
		bw.close();
		
	}
	
	public static File judgeFile(String s) throws IOException {
		File file = new File(s);
		if (!file.exists())
			file.createNewFile();
		return file;
	}
}


