package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF�ṩ�˷����д�������͵ķ���
 * @author L
 *
 */
public class RandomAccessFileDemo3 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf1.dat", "rw");
		/*
		 * long getFilePointer()
		 * ��ȡ��ǰָ��λ��
		 */
		System.out.println(raf.getFilePointer());//��ȡָ��λ��
		
		/*
		 * ���ļ���д��һ����int���ֵ
		 */
		int max = Integer.MAX_VALUE;//��ȡint���ֵ
		raf.write(max>>>24);//���ļ���д��
		raf.write(max>>>16);
		System.out.println(raf.getFilePointer());
		raf.write(max>>>8);
		raf.write(max);
		
		raf.writeInt(max);
		
		raf.writeLong(1234L);//���ļ���д��longֵ
		raf.writeDouble(123.123);//���ļ���д��double
		System.out.println(raf.getFilePointer());
		/*
		 * void seek(long pos)
		 * �ƶ�ָ�뵽ָ��λ��
		 */
		raf.seek(0);//�ƶ�ָ��
		int i = raf.readInt();//��ȡint
		System.out.println(i);
		System.out.println(raf.getFilePointer());
		raf.seek(8);//�ƶ�ָ��
		long long1 = raf.readLong();
		System.out.println(long1);
		System.out.println(raf.getFilePointer());
		raf.seek(0);
		long long2 = raf.readLong();
		System.out.println(long2);
		raf.close();
		
	}

}
