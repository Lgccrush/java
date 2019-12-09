package day06;

import java.io.File;

/**
 * 删除目录
 * delete方法可以删除一个目录,但是前提是该目录是一个空目录
 * @author L
 *
 */
public class FileDemo6 {

	public static void main(String[] args) {
		File dir  = new File("a"+File.separator+"b");
		if (!dir.exists()) {
//			System.out.println("删除目录");
			dir.mkdirs();
		}
	}

}
