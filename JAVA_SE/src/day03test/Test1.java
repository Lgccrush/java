package day03test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求 用户输入自己的生日 格式为1993-10-18 计算到今天活了多少天 距离10000天还有多少天 10000的纪念日是xxxx年xx月xx日
 * 
 * @author L
 *
 */
public class Test1 {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请您输入生日");
		String line = scanner.nextLine();// 获取用户输入
		Date now = new Date();// 获取当前毫秒
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");// 指定日期格式
		Date birDate = sdf.parse(line);// 把用户输入转为Date对象
		long time = now.getTime() - birDate.getTime();// 用当前毫秒减去用户毫秒
		time = time / 1000 / 60 / 60 / 24;// 毫秒转换为天
		System.out.println("恭喜你,你已经活了" + time + "天了");
		System.out.println("距离10000天还有" + (10000 - time) + "天");
		long time1 = 10000 - time;// 获取距离10000天的天数
		time1 = time1 * 24 * 60 * 60 * 1000;// 转换为毫秒
		now.setTime(time1 + now.getTime());
		System.out.println("10000的纪念日是" + sdf.format(now));
	}

}
