package day08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * ��ɼ��±�����
 * Ҫ��:
 * ����������,Ҫ���û�����һ���ļ���,Ȼ�󴴽����ļ�,֮����ʾ�û���ʼ��������
 * �����û������ÿһ�����ݶ�����д�뵽���ļ�.
 * ���û�����"exit",�˳�����
 * @author L
 *
 */
public class Test {

	public static void main(String[] args) throws IOException {
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("���������ļ���");
		String name = sc.nextLine();
		File file = new File(name);
		System.out.println("������������");
		String line = sc.nextLine();
		PrintWriter pw =new PrintWriter(file);
		pw.print(line);
		
		
			pw.close();*/
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ļ���");
		String name = sc.nextLine();
		FileOutputStream fos = new FileOutputStream(name);//�����ֽ������
		OutputStreamWriter ost = new OutputStreamWriter(fos);//�����ַ������
		/*
		 * �Զ���ˢ��
		 */
		PrintWriter pw = new PrintWriter(ost,true);//���������ַ���
		System.out.println("������������");
		String line = null;
		while (true) {
			 line = sc.nextLine();
			if ("exit".equals(line)) {
				System.out.println("�ټ�");
				break;
			}
			/*
			 * PrintWriter�����Զ���ˢ��
			 * ��ôÿ�ε���println�����ͻ��Զ�flush
			 */
			pw.println(line);
		}
		
	}

}
