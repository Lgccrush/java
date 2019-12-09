package day08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * java.io.BufferedReader
 * 缓冲字符输入流,特点:按行读取字符串
 * 
 */
public class BRDemo {
	public static void main(String[] args) throws IOException {

		//创建字节输入流
		FileInputStream fis = new FileInputStream("src/day08/BRDemo.java");
		//创建字符输入流
		InputStreamReader isr = new InputStreamReader(fis);
		//创建缓冲字符输入流
		BufferedReader br = new BufferedReader(isr);
		/*
		 * string readLine()
		 * 连续读取若干字符,直到读取到换行符为止
		 * 并将换行符之间读取的字符以一个字符串返回
		 * 若返回值为null
		 * 则表示读取到末尾
		 * 注意:该字符串不包含最后的换行符
		 */
		String line = null;
		while ((line=br.readLine())!=null) {
			System.out.println(line);
		}
		fis.close();
	}
}
