package day08;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * �����ַ���
 * BufferedWriter,BufferedReader
 * �ص��ǿ��԰��ж�ȡ�ַ���
 * java.io.PrintWriter
 * �����Զ���ˢ�µĻ����ַ������
 * ����PWʱ,��һ�������ڲ�����BufferedWriter
 * ��Ϊ���幦�ܵĵ���
 * @author L
 *
 */
public class PWDemo1 {

	public static void main(String[] args) throws IOException {
		/*
		 * �ṩ�˶��ֹ��췽��
		 * ��������������ֱ�Ӷ��ļ�����д�������Ĺ��췽��
		 * 
		 * PrintWriter(File file)
		 * PrintWriter(String path)
		 */
		//����һ�������ַ���
		PrintWriter pw = new PrintWriter("pw.txt","utf-8");
		pw.println("һ�ж����������");//д������
		pw.print("�����ȥ");
		System.out.println("д�����");
		pw.close();
		
	}

}
