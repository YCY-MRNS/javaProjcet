package pers.ycy.report.test4;

import java.io.*;

public class Program1 {
	public static void main(String[] args) throws IOException {
		// 判断写入的文件是否存在，放在FileWriter中
		// 需要提前存在test文本，且有内容
		//创建IO文件字符流
		FileWriter fw = new FileWriter(judgeFile("C:/test2.txt"));
		FileReader fr = new FileReader("I:/java/MyReport/test.txt");
		// 创建缓冲字符流的对象
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		String lineText = "";
		int lineNum = 0;
		System.out.println("以下是读取的Test.txt的内容：");

		while ((lineText = br.readLine()) != null) {
			lineNum++;
			System.out.println(lineNum + "." + lineText);
			// 利用BufferedWriter写入新的文件中
			bw.write(lineNum + "." + lineText + "\n");
		}
		System.out.println("已经拷贝到新的文件中去！");

		// 关闭IO流
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
