package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合支持泛型,而泛型用来约束集合中元素的类型
 * 
 * @author L
 *
 */
public class CollectionDemo3 {

	public static void main(String[] args) {
		// 定义一个集合,只能传入字符串类型
		Collection<String> c = new ArrayList<String>();
		// 向集合添加元素
		c.add("one");
		c.add("tow");
		c.add("three");
		c.add("four");
		// 遍历集合元素
		for (String string : c) {
			System.out.println(string);
		}
		/*
		 * 迭代器也应当指定泛型,而泛型的实际类型应当与它 遍历的集合的泛型类型一致
		 */
		Iterator<String> i = c.iterator();// 获取迭代器
		while (i.hasNext()) {// 使用迭代器遍历集合
			String str = (String) i.next();// 获取元素时不需要造型了
			System.out.println(str);
		}
	}

}
