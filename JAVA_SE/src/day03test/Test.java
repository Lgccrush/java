package day03test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 查看当前系统时间和 16天5小时23分40秒以后的日期 显示格式 xxxx年xx月xx日 xx:xx:xx
 * 
 * @author L
 *
 */
public class Test {

	public static void main(String[] args) {
		Date now = new Date();// 获取当前毫秒
		SimpleDateFormat sdFormat = new SimpleDateFormat(
				"yyyy年-MM月-dd日 HH-mm-ss");// 指定日期格式
		String date = sdFormat.format(now);// 转换时间格式
		System.out.println("系统当前时间是" + date);

		long time = now.getTime();// 获取long值
		// 计算16天5小时23分40秒
		time += 1000 * 60 * 60 * 24 * 16;// 16天
		time += 1000 * 60 * 60 * 5;// 5天
		time += 1000 * 60 * 23;// 23分
		time += 1000 * 40;// 40秒
		now.setTime(time);
		String date1 = sdFormat.format(now);// 转换时间格式
		System.out.println("16天5小时23分40秒系统当前时间是" + date1);
	}

}
