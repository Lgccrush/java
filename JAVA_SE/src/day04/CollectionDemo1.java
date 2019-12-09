package day04;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * 删除集合元素
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
		System.out.println(c);// 打印集合元素
		/*
		 * boolean remove(E e) 从集合中删除指定元素,删除成功返回true
		 * 只删除集合第一个与给定元素equals比较为true的元素
		 */
		c.remove(new Point(1, 2));// 删除指定元素
		System.out.println(c);// 再次打印集合元素
	}

}
