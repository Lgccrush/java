package day03test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * //输入一个生产日期"yyyy-MM-dd",再输入一个数字(保质期的天数),
 * 
 * //然后经过计算输出促销时期,促销时期为:该商品过期日前2周的周3
 * 
 * @author L
 *
 */
public class Test5 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);// 创建键盘录入对象
		System.out.println("请输入生产日期");
		String date = sc.nextLine();// 接受用户输入生产日期
		System.out.println("请输保质期");
		Scanner sc1 = new Scanner(System.in);// 创建键盘录入对象
		int days = Integer.parseInt(sc1.nextLine());// 接受用户输入的保质期并转换为整数
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");// 创建日期格式
		Date date2 = sdf.parse(date);// 把用户输入生产日期转换为Date对象
		Calendar calendar = Calendar.getInstance();// 创建日历类用于计算
		calendar.setTime(date2);// 把Date转换为日历对象
		calendar.add(calendar.DAY_OF_YEAR, days);// 计算保质期
		calendar.add(calendar.DAY_OF_YEAR, -14);// 计算保质期前两周
		calendar.add(calendar.DAY_OF_WEEK, 4);// 计算保质期前两周星期三
		String day = sdf.format(calendar.getTime());// 把Calendar转换为Date对象再转为字符串
		System.out.println("促销日是" + day);

	}

}
