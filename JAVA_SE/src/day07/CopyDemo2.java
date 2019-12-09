package day07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java.io.BufferdInputStrean
 * java.io.BufferdOutputStream
 * 缓冲字节输入输出流是以对高级流,使用它们可以加快读写效率
 * 
 * 高级流可以处理其他流,但是无论添加了多少高级流,最底下都要有低级流,因为低级流才是真实读写数据的流
 * 高级流都是处理数据的,高级流处理其他流就形成了流的连接,
 * 并且有效的组合不同的高级流可以得到叠加效果
 * @author L
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {
		//创建低级流
		FileInputStream fis = new FileInputStream("demo1.txt");
		//装上高级流
		BufferedInputStream bis = new BufferedInputStream(fis);
		//创建输出流
		FileOutputStream fos = new FileOutputStream("demo2.txt");
		//装上高级流
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int len = -1;
		/*
		 * 缓冲流内部有一个缓冲区
		 * 当bis.read方法读取第一个字节的时候,
		 * 实际上BIS会一次性读取一组字节并存入内部字节数组中
		 * 然后将第一个字节返回,当再次调用read方法时,BIS直接从字节数组中将第二个字节返回
		 * 直到所有字节数组中所有字节全部返回后,才会再次读取一组字节,
		 * 所以缓冲流也是依靠提高一次读写的数据量减少读写次数来提高效率的
		 */
		while ((len=bis.read())!=-1) {//读写数据
			bos.write(len);
		}
		bis.close();
		bos.close();
	}

}
