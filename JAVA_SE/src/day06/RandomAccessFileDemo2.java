package day06;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * ��ȡ�ļ�����
 * @author L
 *
 */
public class RandomAccessFileDemo2 {

	public static void main(String[] args) throws Exception {
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "r");
		/*
		 * void read ()
		 * ��ȡһ���ֽ�,����10���Ƶ�int�ͷ���
		 * ������ֵΪ-1,���ʾ��ȡ���ļ�ĩβ
		 */
		int d = raf.read();
		System.out.println(d);
		raf.close();
			
		
	}

}
