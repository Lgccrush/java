package day08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.InputStreamReader
 * 字符输入流,可以按照给定的字符集读取字符
 * @author L
 *
 */
public class ISRDemo {

	public static void main(String[] args) throws IOException {
		//创建输入流
		FileInputStream fis = new FileInputStream("osw.txt");
		//创建字符输入流
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");

		int d = -1;
		while ((d=isr.read())!=-1) {//读入数据
			System.out.print((char)d);
		}
		isr.close();
	}

}
