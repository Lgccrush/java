package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ���ļ��������ļ�
 * @author L
 *
 */
public class CopyDemo {

	public static void main(String[] args) throws IOException {
		/*//��������ļ�
		FileOutputStream fos = new FileOutputStream("out.txt");
		//�ַ���
		String str = "��Ҫ����Ŭ��";
		//��������
		byte[] b = str.getBytes();
		
		
		//д����
		fos.write(b);
		System.out.println("д���ɹ�");
		fos.close();
		//���������ļ�
		FileInputStream fis = new FileInputStream("out.txt");
		byte[] b1 = new byte[1024*10];//����Ҫ�����ֽ���
		int read2 = fis.read(b1);
		String str1 = new String(b1, 0, read2);
		fis.close();
		FileOutputStream fos1 = new FileOutputStream("int.txt");
		byte[] b3 = str.getBytes();
		fos1.write(b3);
		System.out.println("д���ɹ�");
		fos1.close();*/
		/*
		 * ʹ���ļ���������ȡԭ�ļ�,��ʹ���ļ��������Ŀ���ļ�д��
		 * ˳���Դ�ļ��ж�ȡÿ���ֽڲ�д�뵽Ŀ���ļ�������ɸ���
		 */
		//����������
		FileInputStream fis = new FileInputStream("demo.txt");
		//���������
		FileOutputStream fos = new FileOutputStream("demo1.txt");
		//�����ֽ�����
		byte[] b = new byte[1024*10];
		int len = -1;
		while ((len=fis.read(b))!=-1) {
			fos.write(b, 0, len);
		}
		System.out.println("�������");
		fis.close();
		fos.close();
	}

}
