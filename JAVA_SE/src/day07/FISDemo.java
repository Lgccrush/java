package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * �ļ�������,��һ���ͼ���,���ڴ��ļ��ж�ȡ�ֽ�
 * @author L
 *
 */
public class FISDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream ios = new FileInputStream("out.txt");//��������������
		
		byte[] data = new byte[100];//����һ��byte����
		int read = ios.read(data);//���ļ�����
		String str = new String(data, 0, read,"utf-8");
		System.out.println("�������");
		System.out.println(str);
		ios.close();
	}

}
