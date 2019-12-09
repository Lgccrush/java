package day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * PrintWriter也提供了可以处理其他流的方法
 * 提供的方法可以传入字节流,也可以出里字符流
 * 当使用这类构造方法是,可以再传入第二个参数,
 * 该参数为boolean值,该值为true时
 * 则具有自动行刷新功能
 * @author L
 *
 */
public class PWDemo2 {

	public static void main(String[] args) throws IOException {
		//创建字节输出流
		FileOutputStream fos = new FileOutputStream("pw1.txt");
		//创建转换流
		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
		//创建字符流
		PrintWriter pw = new PrintWriter(osw);
		pw.print("呵呵");
		pw.print("哈哈");
		System.out.println("写出完成");
		pw.close();
	}

}
