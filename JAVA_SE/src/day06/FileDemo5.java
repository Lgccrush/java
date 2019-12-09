package day06;

import java.io.File;

/**
 * 创建一个多级目录
 * @author L
 *
 */
public class FileDemo5 {

	public static void main(String[] args) {
		//获取file对象
		File dir = new File("a"+File.separator+"b"+File.separator+"c"+File.separator+"d"+File.separator+"e"+File.separator+"f");
		/*
		 * 在创建当前目录的同时会将不存在的目录一起创建出来
		 */
		//创建多级目录
		if (!dir.exists()) {
			System.out.println("创建目录");
			dir.mkdirs();
		} else {
			System.out.println("该目录已存在");
		}
	}

}
