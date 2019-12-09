package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * 流
 * 流根据方向不同分为输入流和输出流,参照点为当前程序.
 * java.io.InputStream
 * 抽象类,定义了输入流的读取字节方法,所有的字节输入流都继承自他
 * 
 * java.io.OutputStream则是所有字节流的父类
 * 
 * 流分类节点流与处理流
 * 节点流,也叫低级流.是真实负责读写数据的流
 * 读写操作中必须要有低级流.数据源明确.
 * 
 * 处理流 也叫高级流 读写可以没有高级流,高级流也不能独立存在
 * 必须用于处理其他流,处理其他流的目的是简写数据中的操作
 * 
 * java.io.FileOutputStream
 * 文件输出流,是一个低级流.作用是向文件中写出字节
 * @author L
 *
 */
public class FOSDemo {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 创建输出流对象,默认创建的对象是覆盖写操作
		 * 会先将文件数据(若有数据)全部删除,然后再开始写
		 */
		@SuppressWarnings("resource")
		FileOutputStream out = new FileOutputStream("out.txt");
		String str = "我爱北京天安门";
		/*
		 * byte getBytes(String csn)
		 * 按照给定的字符集将当前字符串转换为一组字节
		 */
		byte[] bytes = str.getBytes("utf-8");
		out.write(bytes);//写出一组字节
		System.out.println("写出完毕");
		out.close();
 	}

}
