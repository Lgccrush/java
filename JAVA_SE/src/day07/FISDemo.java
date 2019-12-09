package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 文件输入流,是一个低级流,用于从文件中读取字节
 * @author L
 *
 */
public class FISDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream ios = new FileInputStream("out.txt");//创建输入流对象
		
		byte[] data = new byte[100];//创建一个byte数组
		int read = ios.read(data);//读文件数据
		String str = new String(data, 0, read,"utf-8");
		System.out.println("读入完成");
		System.out.println(str);
		ios.close();
	}

}
