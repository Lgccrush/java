package day06;

import java.io.File;

/**
 * ɾ��һ���ļ�
 * @author L
 *
 */
public class FileDemo3 {

	public static void main(String[] args) {
		/*
		 * ɾ����ǰĿ¼�µ�test.txt�ļ�
		 */
		File file = new File("test.txt");//�����ļ�
		if (file.exists()) {
			System.out.println("ɾ���ļ�");
			file.delete();
		} else {
			System.out.println("�ļ�������");
		}
	}

}
