package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * boolean contains(E e) 判断当前集合是否包含给定元素
 * 
 * @author L
 *
 */
public class CollectionDemo1 {

	public static void main(String[] args) {
		Collection c = new ArrayList();// 创建集合
		// 添加元素
		c.add(new Point(1, 2));
		c.add(new Point(3, 4));
		c.add(new Point(5, 6));
		System.out.println(c);
		/*
		 * 集合判断是否包含指定元素是根据元素equals比较的结果 只要集合有元素和给定元素比较为true,则认为包含
		 */
		Point point = new Point(1, 2);// 创建point对象
		// System.out.println(point);
		boolean b = c.contains(point);// 判断集合是否包含
		System.out.println(b);

	}

}
