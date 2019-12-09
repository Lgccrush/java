package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * 集合存放元素是存放元素的引用(地址)
 * 
 * @author L
 *
 */
public class CollectionDemo2 {

	public static void main(String[] args) {
		Collection c = new ArrayList();// 创建一个集合
		Point point = new Point(1, 2);// 创建point对象
		c.add(point);// 把point引用添加到集合
		System.out.println(point);
		System.out.println(c);
		point.setx(2);// 更改point坐标X的值
		System.out.println(point);
		System.out.println(c);
	}

}
