package day03;

import java.util.Calendar;

/**
 * 获取一个Calendar表示的日期中 各个时间分量对应的值
 * 
 * @author L
 *
 */
public class CalendarDemo3 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();// 获取一个Calendar
		/*
		 * int get(int field) 获取对应时间分量的值
		 */
		int year = calendar.get(calendar.YEAR);// 获取年
		int month = calendar.get(calendar.MONTH) + 1;// 获取月
		int day = calendar.get(calendar.DATE);// 获取日
		System.out.println(year + "-" + month + "-" + day);
		int hour = calendar.get(calendar.HOUR_OF_DAY);// 获取时
		int minite = calendar.get(calendar.MINUTE);// 获取分
		int second = calendar.get(calendar.SECOND);// 获取分
		System.out.println(hour + ":" + minite + ":" + second);
		// 查看星期几
		Calendar calendar2 = calendar.getInstance();
		int day1 = calendar.get(calendar.DAY_OF_WEEK);// 获取星期几,星期日为第一天
		System.out.println("周" + (day1 == 7 ? 1 : day1 - 1));
		String[] strings = { "日", "一", "二", "三", "四", "五", "六", };
		System.out.println("周" + strings[day1 - 1]);
		// 查看今年过了多少天
		int day2 = calendar.get(calendar.DAY_OF_YEAR);// 获取一年过了多少天
		System.out.println(year + "年已经过了" + day2 + "天");
	}

}
