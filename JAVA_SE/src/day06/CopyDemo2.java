package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ������߶�дЧ��,����ͨ�����ÿ�ζ�д�������������ٶ�д�����ﵽ
 * @author L
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile src = new RandomAccessFile("m.ts", "r");
		RandomAccessFile dec = new RandomAccessFile("m1.ts", "rw");
		/*
		 * int read(byte[] data)
		 * һ���Գ��Զ�ȡ�����ַ������ܳ��ȵ��ֽ����������������,
		 * ����ֵΪʵ�ʶ�ȡ�����ֽ���,������-1,���ʾ����û�ж�ȡ���κ�����(�ļ�ĩβ)
		 */
		byte[] b = new byte[1024*10];
		int len = -1;
		long start = System.currentTimeMillis(); 
		while ((len=src.read(b))!=-1) {
			dec.write(b, 0, len);
		}
		long end = System.currentTimeMillis();
		System.out.println("�������,��ʱ"+(end-start)+"ms");
		src.close();
		dec.close();
	}

}
