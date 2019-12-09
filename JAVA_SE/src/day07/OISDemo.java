package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * java.io.ObjectInputStream 对象输入流,作用是可以进行对象反序列化 读取一组字节并还原为对象
 * OIS读取的字节必须是由OOS将对象序列化得到的字节,否则会抛异常
 * 
 * @author L
 *
 */
public class OISDemo {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		FileInputStream fis = new FileInputStream("person.obj");// 创建文件输入流

		ObjectInputStream ois = new ObjectInputStream(fis);// 创建对象输入流

		System.out.println(ois.readObject());// 读入文件 对象反序列化

		ois.close();
	}

}
