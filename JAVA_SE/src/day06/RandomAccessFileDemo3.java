package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF提供了方便读写基本类型的方法
 * @author L
 *
 */
public class RandomAccessFileDemo3 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf1.dat", "rw");
		/*
		 * long getFilePointer()
		 * 获取当前指针位置
		 */
		System.out.println(raf.getFilePointer());//获取指针位置
		
		/*
		 * 向文件中写入一个人int最大值
		 */
		int max = Integer.MAX_VALUE;//获取int最大值
		raf.write(max>>>24);//向文件中写入
		raf.write(max>>>16);
		System.out.println(raf.getFilePointer());
		raf.write(max>>>8);
		raf.write(max);
		
		raf.writeInt(max);
		
		raf.writeLong(1234L);//向文件中写入long值
		raf.writeDouble(123.123);//向文件中写入double
		System.out.println(raf.getFilePointer());
		/*
		 * void seek(long pos)
		 * 移动指针到指定位置
		 */
		raf.seek(0);//移动指针
		int i = raf.readInt();//读取int
		System.out.println(i);
		System.out.println(raf.getFilePointer());
		raf.seek(8);//移动指针
		long long1 = raf.readLong();
		System.out.println(long1);
		System.out.println(raf.getFilePointer());
		raf.seek(0);
		long long2 = raf.readLong();
		System.out.println(long2);
		raf.close();
		
	}

}
