package day06;

import java.io.File;

/**
 * ����һ��Ŀ¼
 * @author L
 *
 */
public class FileDemo4 {

	public static void main(String[] args) {
		/*
		 * �ڵ�ǰ��Ŀ�´���demoĿ¼
		 */
		File dir = new File("demo");//����file����
		//�ж�
		if (!dir.exists()) {
			System.out.println("�����µ�Ŀ¼");
			dir.mkdir();
		} else {
			System.out.println("��Ŀ¼�Ѵ���");
		}
		
	}

}
