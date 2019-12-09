package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 复制文件
 * @author L
 *
 */
public class CopyDemo1 {

	public static void main(String[] args) throws IOException {
		/*
		 * 创建一个RAF读取源文件,再创建一个RAF向目标文件写出,
		 * 顺序从源文件中读取每一个字节并写到目标文件中即可
		 */
		RandomAccessFile src = new RandomAccessFile("单词笔记.txt", "r");//读
		RandomAccessFile desc = new RandomAccessFile("单词笔记1.txt", "rw");//写
		int d = -1;
		long start = System.currentTimeMillis();
		while ((src.read())!=d) {//读到末尾就不读了
			desc.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制结束,耗时"+(end-start)+"ms");
		src.close();
		desc.close();
	}

}
