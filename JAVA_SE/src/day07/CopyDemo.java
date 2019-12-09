package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流复制文件
 * @author L
 *
 */
public class CopyDemo {

	public static void main(String[] args) throws IOException {
		/*//创建输出文件
		FileOutputStream fos = new FileOutputStream("out.txt");
		//字符串
		String str = "我要继续努力";
		//创建数组
		byte[] b = str.getBytes();
		
		
		//写数据
		fos.write(b);
		System.out.println("写出成功");
		fos.close();
		//创建输入文件
		FileInputStream fis = new FileInputStream("out.txt");
		byte[] b1 = new byte[1024*10];//创建要读的字节数
		int read2 = fis.read(b1);
		String str1 = new String(b1, 0, read2);
		fis.close();
		FileOutputStream fos1 = new FileOutputStream("int.txt");
		byte[] b3 = str.getBytes();
		fos1.write(b3);
		System.out.println("写出成功");
		fos1.close();*/
		/*
		 * 使用文件输入流读取原文件,再使用文件输出流向目标文件写入
		 * 顺序从源文件中读取每个字节并写入到目标文件即可完成复制
		 */
		//创建输入流
		FileInputStream fis = new FileInputStream("demo.txt");
		//创建输出流
		FileOutputStream fos = new FileOutputStream("demo1.txt");
		//创建字节数组
		byte[] b = new byte[1024*10];
		int len = -1;
		while ((len=fis.read(b))!=-1) {
			fos.write(b, 0, len);
		}
		System.out.println("复制完毕");
		fis.close();
		fos.close();
	}

}
