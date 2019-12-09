package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 若想提高读写效率,可以通过提高每次读写的数据量来减少读写次数达到
 * @author L
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile src = new RandomAccessFile("m.ts", "r");
		RandomAccessFile dec = new RandomAccessFile("m1.ts", "rw");
		/*
		 * int read(byte[] data)
		 * 一次性尝试读取给定字符数组总长度的字节量并存入该数组中,
		 * 返回值为实际读取到的字节量,若返回-1,则表示本次没有读取到任何数据(文件末尾)
		 */
		byte[] b = new byte[1024*10];
		int len = -1;
		long start = System.currentTimeMillis(); 
		while ((len=src.read(b))!=-1) {
			dec.write(b, 0, len);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕,耗时"+(end-start)+"ms");
		src.close();
		dec.close();
	}

}
