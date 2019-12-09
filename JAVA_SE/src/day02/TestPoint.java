package day02;

import java.nio.channels.Pipe;

/**
 * 测试Point重写Object相关方法
 * @author L
 *
 */
public class TestPoint {

	public static void main(String[] args) {
		Point p1 = new Point(1,2);//创建对象并赋值
//		String str = p1.toString();//调用toString方法
//		System.out.println(str);
		/*
		 * 直接打印对象的引用,默认调用toString方法
		 */
		System.out.println(p1);
		
		Point p2 = new Point(1,2);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
	}

}
