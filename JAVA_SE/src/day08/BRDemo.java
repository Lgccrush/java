package day08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * java.io.BufferedReader
 * �����ַ�������,�ص�:���ж�ȡ�ַ���
 * 
 */
public class BRDemo {
	public static void main(String[] args) throws IOException {

		//�����ֽ�������
		FileInputStream fis = new FileInputStream("src/day08/BRDemo.java");
		//�����ַ�������
		InputStreamReader isr = new InputStreamReader(fis);
		//���������ַ�������
		BufferedReader br = new BufferedReader(isr);
		/*
		 * string readLine()
		 * ������ȡ�����ַ�,ֱ����ȡ�����з�Ϊֹ
		 * �������з�֮���ȡ���ַ���һ���ַ�������
		 * ������ֵΪnull
		 * ���ʾ��ȡ��ĩβ
		 * ע��:���ַ������������Ļ��з�
		 */
		String line = null;
		while ((line=br.readLine())!=null) {
			System.out.println(line);
		}
		fis.close();
	}
}
