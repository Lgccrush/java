package day06;

import java.io.File;

/**
 * ��ȡһ��Ŀ¼�е���������
 * @author L
 *
 */
public class FileDemo7 {
	public static void main(String[] args) {
		/*
		 * ��ȡ��ǰĿ¼�µ���������
		 */
		File dir = new File(".");
		/*
		 * boolean isFile 
		 * �ж��Ƿ����ļ�
		 * boolean isDirector
		 * �ж��Ƿ���Ŀ¼
		 */
		if (dir.isDirectory()) {
			File[] listFiles = dir.listFiles();
			/*
			 * ��ȡ��ǰĿ¼����������
			 */
			for (File file : listFiles) {
				if (file.isDirectory()) {
					System.out.print("Ŀ¼");
				} else {
					System.out.print("�ļ�");

				}
				System.out.println(file);
			}
		}
	}
}
