package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * ������д�ļ�����
 * RAF�ǻ���ָ����ж�д��,����ָ��ָ���λ�ö�д�ֽ�
 * ���Ҷ�д��ָ����Զ�����ƶ�
 * RAF���Զ�ȡ�ļ�����Ҳ�������ļ���д����
 * @author L
 *
 */
public class RandomAccessFileDemo1 {

	public static void main(String[] args) throws IOException {
		/*
		 * RandomAccessFile(String path,String mode)
		 * RandomAccessFile(File file ,String mode)
		 * �ڶ�������Ϊģʽ
		 * r:ֻ��
		 * rw:��дģʽ
		 * 
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		/*
		 * void write(int d )
		 * д��������intֵ��Ӧ��2���ƵĵͰ�λ
		 *							  vvvvvvvv	 
		 * 00000000 00000000 00000000 00000001
		 */
		raf.write(1);
		System.out.println("д�����");
		raf.close();
	}

}
