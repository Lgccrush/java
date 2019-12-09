package day03;

import java.util.Date;

/**
 * Date的每一个实例用于表示一个确切的时间点
 * 内部维护了一个long值,该值记录的是从1970年1月1日到表示的时间点之间所经历的毫秒值
 * 正数是70年以后的日期,负数是70年以前的日期
 * 由于Date的设计上有缺陷(时区,千年虫)所以它的大部分方法设置为已过期,不建议使用
 * @author L
 *
 */
public class DateDemo {

	public static void main(String[] args) {
		/*
		 * Date 重写了toString方法
		 * 返回字符串显示的是当前表示的时间格式(不够友好)
		 */
		Date now = new Date();
		System.out.println(now);
		//获取Date内部维护的long值
		long time = now.getTime();
		System.out.println(time);
		 time += 1000*60*60*24;//一天的毫秒值
		now.setTime(time);//设置当前毫秒加一天为明天
		System.out.println(now);
	}

}
