package day06;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * 读取文件数据
 * @author L
 *
 */
public class RandomAccessFileDemo2 {

	public static void main(String[] args) throws Exception {
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "r");
		/*
		 * void read ()
		 * 读取一个字节,并以10进制的int型返回
		 * 若返回值为-1,则表示读取到文件末尾
		 */
		int d = raf.read();
		System.out.println(d);
		raf.close();
			
		
	}

}
