package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * �����ļ�
 * @author L
 *
 */
public class CopyDemo1 {

	public static void main(String[] args) throws IOException {
		/*
		 * ����һ��RAF��ȡԴ�ļ�,�ٴ���һ��RAF��Ŀ���ļ�д��,
		 * ˳���Դ�ļ��ж�ȡÿһ���ֽڲ�д��Ŀ���ļ��м���
		 */
		RandomAccessFile src = new RandomAccessFile("���ʱʼ�.txt", "r");//��
		RandomAccessFile desc = new RandomAccessFile("���ʱʼ�1.txt", "rw");//д
		int d = -1;
		long start = System.currentTimeMillis();
		while ((src.read())!=d) {//����ĩβ�Ͳ�����
			desc.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("���ƽ���,��ʱ"+(end-start)+"ms");
		src.close();
		desc.close();
	}

}
