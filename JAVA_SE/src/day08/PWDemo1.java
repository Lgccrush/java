package day08;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 缓冲字符流
 * BufferedWriter,BufferedReader
 * 特点是可以按行读取字符串
 * java.io.PrintWriter
 * 具有自动行刷新的缓冲字符输出流
 * 创建PW时,它一定会在内部创建BufferedWriter
 * 做为缓冲功能的叠加
 * @author L
 *
 */
public class PWDemo1 {

	public static void main(String[] args) throws IOException {
		/*
		 * 提供了多种构造方法
		 * 其中有两个可以直接对文件进行写出操作的构造方法
		 * 
		 * PrintWriter(File file)
		 * PrintWriter(String path)
		 */
		//创建一个缓冲字符流
		PrintWriter pw = new PrintWriter("pw.txt","utf-8");
		pw.println("一切都会好起来的");//写出数据
		pw.print("坚持下去");
		System.out.println("写出完成");
		pw.close();
		
	}

}
