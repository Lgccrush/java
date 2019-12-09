package day06;

import java.io.File;

/**
 * 实现方法来删除给定的文件或目录
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
				delete(file2);//递归 走到一个程序发现所有程序还要走一遍
			}
		}
		file.delete();
	}
}
