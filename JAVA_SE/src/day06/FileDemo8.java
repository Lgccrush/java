package day06;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取一个目录中符合条件的部分子项
 * 使用重载的LIstFils方法,需要传入一个额外的文件过滤器
 * 文件过滤器是一个接口:FileFilter
 * @author L
 *
 */
public class FileDemo8 {

	public static void main(String[] args) {
		File file = new File(".");//获取当前目录
		//获取以"."开头的子项
		File[] files = file.listFiles(new FileFilter() {//用过滤器过滤掉不满足要求的
			
			@Override
			public boolean accept(File file) {
				System.out.println("正在过滤"+file.getName());
				return file.getName().startsWith(".");
			}
		});
		for (File file2 : files) {//遍历过滤后满足要求的
			System.out.println(file2.getName());
		}
	}

}
