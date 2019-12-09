package day07;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲输出流写出数据的缓冲区问题
 */
public class BOSDemo {

	public static void main(String[] args) throws IOException {
		//创建输出流
		FileOutputStream fos = new FileOutputStream("bos.txt");
		//创建缓冲输出流
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		//写出数据
		bos.write("呵呵".getBytes("utf-8"));
		//调用flush方法强制把缓冲区的字节一次性写出
		bos.flush();
		System.out.println("写出完毕");
		//关流
		bos.close();//关流也会调用flush方法
	}

}
