package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * 用来读写文件数据
 * RAF是基于指针进行读写的,就是指针指向的位置读写字节
 * 并且读写后指针后自动向后移动
 * RAF可以读取文件数据也可以向文件中写数据
 * @author L
 *
 */
public class RandomAccessFileDemo1 {

	public static void main(String[] args) throws IOException {
		/*
		 * RandomAccessFile(String path,String mode)
		 * RandomAccessFile(File file ,String mode)
		 * 第二个参数为模式
		 * r:只读
		 * rw:读写模式
		 * 
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		/*
		 * void write(int d )
		 * 写出给定的int值对应的2进制的低八位
		 *							  vvvvvvvv	 
		 * 00000000 00000000 00000000 00000001
		 */
		raf.write(1);
		System.out.println("写出完毕");
		raf.close();
	}

}
