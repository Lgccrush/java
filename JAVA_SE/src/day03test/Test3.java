package day03test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 练习
 * 
 * @author L
 *
 */
public class Test3 {

	public static void main(String[] args) throws ParseException {
		// 将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
		/*
		 * Date nowDate = new Date();//创建Date对象 System.out.println(nowDate);
		 * String s = "yyyy-MM-dd HH:mm:ss";//指定格式 SimpleDateFormat sdf = new
		 * SimpleDateFormat(s);//创建SimpleDateFormat对象
		 * System.out.println(sdf.format(nowDate));//转换格式
		 */
		// 输入某人生日,格式为"yyyy-MM-dd",输出到现在为止经过的多少周
		Scanner sc = new Scanner(System.in);// 创建键盘录入
		System.out.println("请输入生日");
		String line = sc.nextLine();// 接受用户输入字符串
		Date nowDate = new Date();// 创建Date对象
		String s = "yyyy-MM-dd";// 指定格式
		SimpleDateFormat sdf = new SimpleDateFormat(s);
		Date date = sdf.parse(line);// 转换字符串为Date对象
		long nowTime = nowDate.getTime();// 获取用户毫秒值
		long dateTime = date.getTime();// 获取当前毫秒值
		long week = (nowTime - dateTime) / 7 / 24 / 60 / 60 / 1000;// 得出周
		System.out.println("到现在" + week + "周了");

	}

}
