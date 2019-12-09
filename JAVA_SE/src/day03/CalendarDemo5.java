package day03;

import java.util.Calendar;

/**
 * Calendar中计算时间的方法
 * void add(int field,intvalue)
 * 对指定的时间分量加上给定的值,如给是负数,则减去给的值
 * @author L
 *
 */
public class CalendarDemo5 {

	public static void main(String[] args) {
		/*
		 * 查看3年2个月零8天后的日期
		 */
		Calendar calendar = Calendar.getInstance();//获取calendar
		calendar.add(calendar.YEAR, 3);//查看3年后
		System.out.println(calendar.getTime());
		calendar.add(calendar.MONTH, 2);//再查看2个月
		System.out.println(calendar.getTime());
		calendar.add(calendar.DAY_OF_YEAR, 20);//查看天用年中天 因为可能跨年月
		System.out.println(calendar.getTime());
		calendar.add(calendar.HOUR_OF_DAY, -1);//查看一小时前
		System.out.println(calendar.getTime());
		
		/*
		 * 当遇到类似开发需求:
		 * 要求用户输入一个日期,然后对该日期进行一系列操作
		 * 再将结算后的日期返回给用户
		 * 流程如下
		 * 1获取用户输入的时间字符串
		 * 2使用SimpleDateFormat将其转换为Date对象
		 * 3创建一个Calendar,使其表示Date表示的日期
		 * 4使用Calendar根据需求计算日期
		 * 将Calendar转换为Date
		 * 使用SimpleDateFormat将Date转为字符串返回给用户
		 */
	}

}
