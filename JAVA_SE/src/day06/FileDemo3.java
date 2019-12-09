package day06;

import java.io.File;

/**
 * 删除一个文件
 * @author L
 *
 */
public class FileDemo3 {

	public static void main(String[] args) {
		/*
		 * 删除当前目录下的test.txt文件
		 */
		File file = new File("test.txt");//创建文件
		if (file.exists()) {
			System.out.println("删除文件");
			file.delete();
		} else {
			System.out.println("文件不存在");
		}
	}

}
