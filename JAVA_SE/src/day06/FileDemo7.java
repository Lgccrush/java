package day06;

import java.io.File;

/**
 * 获取一个目录中的所有子项
 * @author L
 *
 */
public class FileDemo7 {
	public static void main(String[] args) {
		/*
		 * 获取当前目录下的所有子项
		 */
		File dir = new File(".");
		/*
		 * boolean isFile 
		 * 判断是否是文件
		 * boolean isDirector
		 * 判断是否是目录
		 */
		if (dir.isDirectory()) {
			File[] listFiles = dir.listFiles();
			/*
			 * 获取当前目录下所有子项
			 */
			for (File file : listFiles) {
				if (file.isDirectory()) {
					System.out.print("目录");
				} else {
					System.out.print("文件");

				}
				System.out.println(file);
			}
		}
	}
}
