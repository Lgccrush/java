package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件输出流
 * 追加写操作
 * @author L
 *
 */
public class FOSDemo2 {

	public static void main(String[] args) throws IOException {
		/*
		 * 在创建fos时,若指定第二个参数,并且该值为true时,
		 * 则是追加操作.那么本次通过fos写出的内容会被追加到文件末尾
		 */
		FileOutputStream fos = new FileOutputStream("out.txt",true);
		
		fos.write("天安门上太阳升".getBytes("utf-8"));//向文件末尾追加文字
		System.out.println("写出成功");
		fos.close();
	}

}
