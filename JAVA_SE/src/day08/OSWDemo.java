package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 字符流
 * 字符流的读写单位为字符.
 * 字符流都是高级流,虽然以字符为单位读取数据
 * 但是实际底层还是读取字节,只是从字节到字符的转换工作交给了字符流来完成
 * java.io.Reader:字符输入流的父类
 * java.io.writer:字符输出流的父类
 * 
 * 转换流
 * 之所以称OutputStreamWriter和InputStreamReader为转换流
 * 是因为大部分字符流只处理其他字符流,而低级流又是字节流,这就导致字符流不能处理字节流的问题
 * 转换流相当于一个转换器的作用,它们可以先将字节流转为字符流,这样其他的字符流就可以处理了
 * java.io.OutputStreamWriter
 * 字符输出流
 * 特点是可以按照指定的字符集写字符
 * @author L
 *
 */
public class OSWDemo {

	public static void main(String[] args) throws IOException {
		//创建文件输出流
		FileOutputStream fos = new FileOutputStream("osw.txt");
		//创建字符输出流,并指定字符编码
		OutputStreamWriter writer = new OutputStreamWriter(fos,"utf-8");
		writer.write("我爱北京天安门");//写出数据
		writer.write("天安门上太阳升");
		writer.close();//关流
		
	}

}
