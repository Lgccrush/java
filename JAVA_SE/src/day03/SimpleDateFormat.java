package day03;

import java.util.Date;

/**
 * 对Date日期格式化
 * 
 * @author L
 *
 */
public class SimpleDateFormat {

	public static void main(String[] args) {
		Date now = new Date();// 获取当前毫秒
		java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(
				"yyyy-MM-dd HH-mm-ss");// 指定日期格式
		/*
		 * Date转换为String format 方法可以将给定Date对象所表示的时间
		 * 按照SimpleDateFormat指定日期格式转换为String字符串
		 */
		String string = simpleDateFormat.format(now);// 转换时间格式
		System.out.println(string);

	}

}
