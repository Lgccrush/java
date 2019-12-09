package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import day02.Point;

/**
 * 遍历集合 Collection提供了一个统一的遍历集合的方式 迭代器模式 Iterator iterator() 获取用于遍历当前集合的迭代器
 * java.util.Iterator是一个接口 规定了遍历集合中元素的相关方法 不同集合提供的相应的实现类
 * 无需记住那些实现类的名字,只将它们当作Iterator即可 遍历集合遵循问,取,删的步骤,其中删除不是必须操作
 * 
 * @author L
 *
 */
public class IceractorDemo {

	public static void main(String[] args) {
		Collection c = new ArrayList();// 创建一个集合
		// 添加元素
		c.add("One");
		c.add("#");
		c.add("Two");
		c.add("#");
		c.add("Three");
		c.add("#");
		Iterator i = c.iterator();// 获取迭代器
		while (i.hasNext()) {// 遍历
			String str = (String) i.next();// 向下强转
			if ("#".equals(str)) {
				// c.remove("#");在迭代器遍历集合时,不能用集合的方式去增减元素

				i.remove();// 用迭代器的方法删除next方法取出的元素
			}
			System.out.println(str);
		}
		System.out.println(c);
	}

}
