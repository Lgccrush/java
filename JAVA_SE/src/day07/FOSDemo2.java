package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �ļ������
 * ׷��д����
 * @author L
 *
 */
public class FOSDemo2 {

	public static void main(String[] args) throws IOException {
		/*
		 * �ڴ���fosʱ,��ָ���ڶ�������,���Ҹ�ֵΪtrueʱ,
		 * ����׷�Ӳ���.��ô����ͨ��fosд�������ݻᱻ׷�ӵ��ļ�ĩβ
		 */
		FileOutputStream fos = new FileOutputStream("out.txt",true);
		
		fos.write("�찲����̫����".getBytes("utf-8"));//���ļ�ĩβ׷������
		System.out.println("д���ɹ�");
		fos.close();
	}

}
