package pers.ycy.report.test4;

import java.io.*;

public class Program2 {

	public static void main(String[] args) throws IOException {

		// 需要提前存在test文本，且有内容
		//创建IO文件字节流
		FileInputStream fis = new FileInputStream(new File("I:/java/MyReport/test.txt"));
		FileOutputStream fos = new FileOutputStream(judgeFile("C:/test2.txt"));
		// 创建缓冲字节流的对象
		BufferedInputStream bis = new BufferedInputStream(fis, 512);
		BufferedOutputStream bos = new BufferedOutputStream(fos, 512);

		int size = 0;
		byte[] b = new byte[512];

		while ((size = bis.read(b)) != -1) {
			//转换为String对象
			String string = new String(b, 0, 512);
			System.out.println(string);
			//复制到新的文件中
			bos.write(b, 0, 512);
		}
		System.out.println("已经拷贝到新的文件中去！");
		
		//刷新缓冲区写入文件 关闭流
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
