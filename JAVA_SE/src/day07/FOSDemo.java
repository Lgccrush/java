package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * ��
 * �����ݷ���ͬ��Ϊ�������������,���յ�Ϊ��ǰ����.
 * java.io.InputStream
 * ������,�������������Ķ�ȡ�ֽڷ���,���е��ֽ����������̳�����
 * 
 * java.io.OutputStream���������ֽ����ĸ���
 * 
 * ������ڵ����봦����
 * �ڵ���,Ҳ�еͼ���.����ʵ�����д���ݵ���
 * ��д�����б���Ҫ�еͼ���.����Դ��ȷ.
 * 
 * ������ Ҳ�и߼��� ��д����û�и߼���,�߼���Ҳ���ܶ�������
 * �������ڴ���������,������������Ŀ���Ǽ�д�����еĲ���
 * 
 * java.io.FileOutputStream
 * �ļ������,��һ���ͼ���.���������ļ���д���ֽ�
 * @author L
 *
 */
public class FOSDemo {

	public static void main(String[] args) throws IOException {
		
		/*
		 * �������������,Ĭ�ϴ����Ķ����Ǹ���д����
		 * ���Ƚ��ļ�����(��������)ȫ��ɾ��,Ȼ���ٿ�ʼд
		 */
		@SuppressWarnings("resource")
		FileOutputStream out = new FileOutputStream("out.txt");
		String str = "�Ұ������찲��";
		/*
		 * byte getBytes(String csn)
		 * ���ո������ַ�������ǰ�ַ���ת��Ϊһ���ֽ�
		 */
		byte[] bytes = str.getBytes("utf-8");
		out.write(bytes);//д��һ���ֽ�
		System.out.println("д�����");
		out.close();
 	}

}
