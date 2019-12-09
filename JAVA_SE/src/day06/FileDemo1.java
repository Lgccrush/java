package day06;

import java.io.File;

/**
 * java.io.File
 * File的每一个实例可以表示文件系统中文件或目录
 * 使用File可以:
 * 1:访问文件或目录的属性(如:大小,名字,修改时间等)
 * 2:操作文件或目录(创建,删除文件和目录)
 * 3:访问目录中所有内容
 * 但是不可以:访问文件数据
 * @author L
 *
 */
public class FileDemo1 {

	public static void main(String[] args) {
		File file = new File("."+File.separator+"demo.txt");//创建file对象
		//获取名字
		String name = file.getName();
		System.out.println(name);
		//获取长度
		long leng = file.length();
		System.out.println(leng);
		//判断是否可读 可写
		boolean canRand =file.canRead();
		boolean canWite = file.canWrite();
		System.out.println(canRand);
		System.out.println(canWite);
		//判断是否隐藏
		boolean isHidden = file.isHidden();
		System.out.println(isHidden);
		
	}

}
