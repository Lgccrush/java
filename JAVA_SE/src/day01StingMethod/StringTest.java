package day01StingMethod;

import java.util.Scanner;

/**
 * 编写一个程序,要求用户输入一个网站消息
 * 格式可以如下:
 * www.baidu.com
 * www.baidu.con.cn
 * http://www.baidu.com
 * 然后经过处理,输出域名,如:baidu
 */
public class StringTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个网站");
		String string = scanner.nextLine();
		//获取第一个.之后的第一个字符的位置
		int start = string.indexOf(".")+1;
		//获取第二个字符的位置
		int end = string.indexOf(".", start);
		String string2 = string.substring(start, end);
		System.out.println("域名是"+string2);
	}

}
