package day03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar 日历类 该类是一个抽象类,封装了对时间的相关操作 常用的实现类格里高利历(阳历) 使用
 * 日历类是为了对时间进行相关操作 比如计算时间
 * 
 * @author L
 *
 */
public class CalendarDemo2 {

	public static void main(String[] args) {
		/*
		 * 使用Calender的静态方法创建实例 该方法会根据当前系统所在地区创建一个相应的实例
		 * 通常GregorianCalendar默认创建的日历实例表示当前系统时间
		 */
		Calendar calendar = Calendar.getInstance();
		/*
		 * toString不能直观反映表示的日期
		 */
		System.out.println(calendar);

		/*
		 * Calendar与Date之间的互转 Calendar提供了方法getTime,该方法返回一个Date对象
		 * 该对象表示的时间就是当前Calendar表示的时间
		 */
		Date date = calendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		/*
		 * 表示明天这一时刻
		 */
		date.setTime(date.getTime() + 1000 * 60 * 60 * 24);

		System.out.println(sdf.format(date));
		/*
		 * Date--->Calendar void setTime(Date date)
		 * Calendar的setTime方法可以使当前Calendar表示给定的Date所表示的时间
		 */
		// Calendar也表示明天这一时刻
		calendar.setTime(date);
	}

}
