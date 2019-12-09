package day03;

import java.util.Calendar;

/**
 * 获取某一个时间分量所允许的最大值
 * @author L
 *
 */
public class CalendarDemo4 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();//获取一个Calendar
		int maximum = calendar.getActualMaximum(calendar.DAY_OF_MONTH);//当月有多少天
		System.out.println(maximum);
		
		calendar.set(calendar.MONTH, 1);//设置当前月为2月
		int days = calendar.getActualMaximum(calendar.DAY_OF_MONTH);//获取当月天数最大值
		System.out.println(days);
		
		int day2 = calendar.getActualMaximum(calendar.DAY_OF_YEAR);//获取一年有多少天
		System.out.println(day2);
	}

}
