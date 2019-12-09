package day06;

import java.io.File;
import java.io.FileFilter;

/**
 * ��ȡһ��Ŀ¼�з��������Ĳ�������
 * ʹ�����ص�LIstFils����,��Ҫ����һ��������ļ�������
 * �ļ���������һ���ӿ�:FileFilter
 * @author L
 *
 */
public class FileDemo8 {

	public static void main(String[] args) {
		File file = new File(".");//��ȡ��ǰĿ¼
		//��ȡ��"."��ͷ������
		File[] files = file.listFiles(new FileFilter() {//�ù��������˵�������Ҫ���
			
			@Override
			public boolean accept(File file) {
				System.out.println("���ڹ���"+file.getName());
				return file.getName().startsWith(".");
			}
		});
		for (File file2 : files) {//�������˺�����Ҫ���
			System.out.println(file2.getName());
		}
	}

}
