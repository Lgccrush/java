package day06;

import java.io.File;

/**
 * ʵ�ַ�����ɾ���������ļ���Ŀ¼
 * @author L
 *
 */
public class Test {

	public static void main(String[] args) {
		File dir = new File("a");
		delete(dir);
	}
	public static void  delete(File file) {
		if (file.isDirectory()) {
			File[] listFiles = file.listFiles();
			for (File file2 : listFiles) {
				/*if (file2.isDirectory()) {
//					file2.delete();
				}*/
//				System.out.println(file2);
				delete(file2);//�ݹ� �ߵ�һ�����������г���Ҫ��һ��
			}
		}
		file.delete();
	}
}
