package pers.ycy.report.test4;

import java.io.File;
import java.io.RandomAccessFile;
import java.sql.Ref;

public class Program8 {

	public static void main(String[] args) throws Exception {

		File file =new File("C://test2.txt");
		RandomAccessFile raf = new RandomAccessFile("C://test2.txt", "rw");
	

		raf.close();

	}

}
