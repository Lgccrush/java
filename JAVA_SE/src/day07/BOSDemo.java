package day07;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���������д�����ݵĻ���������
 */
public class BOSDemo {

	public static void main(String[] args) throws IOException {
		//���������
		FileOutputStream fos = new FileOutputStream("bos.txt");
		//�������������
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		//д������
		bos.write("�Ǻ�".getBytes("utf-8"));
		//����flush����ǿ�ưѻ��������ֽ�һ����д��
		bos.flush();
		System.out.println("д�����");
		//����
		bos.close();//����Ҳ�����flush����
	}

}
