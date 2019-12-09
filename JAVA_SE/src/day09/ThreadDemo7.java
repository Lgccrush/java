package day09;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * static void sleep(long ms) 线程提供的方法sleep可以使运行该方法的线程进入阻塞状态指定毫秒,
 * 超时后会自动回到runnable状态.
 * 
 * @author L
 *
 */
public class ThreadDemo7 {

	public static void main(String[] args) {
		/**
		 * 完成电子表功能 每秒输出一次当前时间 xx:xx:xx
		 */
		//自己写的
		/*while (true) {
			try {
				Date now = new Date();// 获取系统当前时间
				
				 * Calendar c = Calendar.getInstance(); c.setTime(now);
				 String str = "HH:mm:ss";// 设置时间格式
				SimpleDateFormat sdf = new SimpleDateFormat(str);
				Thread.sleep(1000);// 设置线程阻塞时间
				System.out.println(sdf.format(now));// 转换并输出
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}*/
		//老师写的
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");//设置时间格式
		while (true) {
			try {
				Thread.sleep(1000);
				System.out.println(sdf.format(new Date()));//获取当前时间并输出
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}

	}

}
