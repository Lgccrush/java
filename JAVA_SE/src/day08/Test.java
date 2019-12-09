package day08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 完成记事本功能
 * 要求:
 * 程序启动后,要求用户输入一个文件名,然后创建该文件,之后提示用户开始输入内容
 * 并将用户输入的每一行内容都按行写入到该文件.
 * 当用户输入"exit",退出程序
 * @author L
 *
 */
public class Test {

	public static void main(String[] args) throws IOException {
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("请您输入文件名");
		String name = sc.nextLine();
		File file = new File(name);
		System.out.println("请你输入内容");
		String line = sc.nextLine();
		PrintWriter pw =new PrintWriter(file);
		pw.print(line);
		
		
			pw.close();*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入文件名");
		String name = sc.nextLine();
		FileOutputStream fos = new FileOutputStream(name);//创建字节输出流
		OutputStreamWriter ost = new OutputStreamWriter(fos);//创建字符输出流
		/*
		 * 自动行刷新
		 */
		PrintWriter pw = new PrintWriter(ost,true);//创建缓冲字符流
		System.out.println("请你输入内容");
		String line = null;
		while (true) {
			 line = sc.nextLine();
			if ("exit".equals(line)) {
				System.out.println("再见");
				break;
			}
			/*
			 * PrintWriter具有自动行刷新
			 * 那么每次调用println方法就会自动flush
			 */
			pw.println(line);
		}
		
	}

}
