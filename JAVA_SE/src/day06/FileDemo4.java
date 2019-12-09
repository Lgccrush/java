package day06;

import java.io.File;

/**
 * 创建一个目录
 * @author L
 *
 */
public class FileDemo4 {

	public static void main(String[] args) {
		/*
		 * 在当前项目下创建demo目录
		 */
		File dir = new File("demo");//创建file对象
		//判断
		if (!dir.exists()) {
			System.out.println("创建新的目录");
			dir.mkdir();
		} else {
			System.out.println("该目录已存在");
		}
		
	}

}
