package pers.ycy.report.test4;

import java.io.*;

public class Program1 {
	public static void main(String[] args) throws IOException {
		// �ж�д����ļ��Ƿ���ڣ�����FileWriter��
		// ��Ҫ��ǰ����test�ı�����������
		//����IO�ļ��ַ���
		FileWriter fw = new FileWriter(judgeFile("C:/test2.txt"));
		FileReader fr = new FileReader("I:/java/MyReport/test.txt");
		// ���������ַ����Ķ���
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		String lineText = "";
		int lineNum = 0;
		System.out.println("�����Ƕ�ȡ��Test.txt�����ݣ�");

		while ((lineText = br.readLine()) != null) {
			lineNum++;
			System.out.println(lineNum + "." + lineText);
			// ����BufferedWriterд���µ��ļ���
			bw.write(lineNum + "." + lineText + "\n");
		}
		System.out.println("�Ѿ��������µ��ļ���ȥ��");

		// �ر�IO��
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
