package pers.ycy.report.test4;

import java.io.*;

public class Program2 {

	public static void main(String[] args) throws IOException {

		// ��Ҫ��ǰ����test�ı�����������
		//����IO�ļ��ֽ���
		FileInputStream fis = new FileInputStream(new File("I:/java/MyReport/test.txt"));
		FileOutputStream fos = new FileOutputStream(judgeFile("C:/test2.txt"));
		// ���������ֽ����Ķ���
		BufferedInputStream bis = new BufferedInputStream(fis, 512);
		BufferedOutputStream bos = new BufferedOutputStream(fos, 512);

		int size = 0;
		byte[] b = new byte[512];

		while ((size = bis.read(b)) != -1) {
			//ת��ΪString����
			String string = new String(b, 0, 512);
			System.out.println(string);
			//���Ƶ��µ��ļ���
			bos.write(b, 0, 512);
		}
		System.out.println("�Ѿ��������µ��ļ���ȥ��");
		
		//ˢ�»�����д���ļ� �ر���
		bos.flush();
		bis.close();
		bos.close();

	}

	public static File judgeFile(String s) throws IOException {
		File file = new File(s);
		if (!file.exists())
			file.createNewFile();
		return file;
	}

}
