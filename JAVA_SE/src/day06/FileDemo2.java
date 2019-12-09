package day06;

import java.io.File;
import java.io.IOException;

/**
 * 创建一个文件
 * @author L
 *
 */
public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		/*
		 * 在当前目录下创建文件test.txt
		 * 默认路径就是当前目录即"./"所以可以不写
		 */
		File file = new File("test.txt");//创建文件
		/*
		 * boolean exists
		 * 判断该文件是否存在
		 */
		if (!file.exists()) {//判断文件是否存在
			file.createNewFile();
			System.out.println("创建完毕");
		} else {
			System.out.println("该文件已存在");
		}
		
		
		
	}

}
