package day03;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar提供针对不同时间分量单独设置值得方法 void set(int field,int value)
 * 其中第一个参数为:时间分量,列如:年,月,日等等 第二个参数为对应的值 时间分量是一个int值,使用calendar提供的常量
 * 
 * @author L
 *
 */
public class CalendarDemo6 {

	public static void main(String[] args) {
		// Calendar表示当前时间
		Calendar calendar = Calendar.getInstance();
		// Date date = calendar.getTime();// Date表示当前时间
		/*
		 * 设置Calendar 2008-08-08 20:08:08
		 */
		// 设置年
		calendar.set(calendar.YEAR, 2008);
		System.out.println(calendar.getTime());
		/*
		 * 设置月 月从0开始的,0表示1月 或者可以使用具体月的常量
		 */
		calendar.set(calendar.MONTH, 7);
		// calendar.set( calendar.MONTH, calendar .AUGUST);
		System.out.println(calendar.getTime());
		/*
		 * 设置日 对应的时间分量常用的: DATE:月中天 DAY_OF_MONTH:月中的天,与DATE一致
		 * DAY_OF_WEEK:周中的天,星期几 DAY_OF_YEAR:年中的天
		 */
		// 设置天
		calendar.set(calendar.DAY_OF_MONTH, 8);
		System.out.println(calendar.getTime());
		// 设置时分秒
		calendar.set(calendar.HOUR_OF_DAY, 20);
		calendar.set(calendar.MINUTE, 8);
		calendar.set(calendar.SECOND, 8);
		System.out.println(calendar.getTime());
	}

}