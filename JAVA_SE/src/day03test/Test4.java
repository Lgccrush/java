package day03test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 练习
 * 
 * @author L
 *
 */
public class Test4 {

	public static void main(String[] args) {
		// 创建一个集合,存放字符串"one","tow","three",
		Collection c = new ArrayList();
		c.add("one");
		c.add("tow");
		c.add("three");
		// 输出该集合的元素个数
		System.out.println(c.size());
		// 输出该集合是否包含字符串"four"
		boolean b = c.contains("four");
		System.out.println(b);
		// 输出集合是否不包含任何元素
		System.out.println(c.isEmpty());
		// 清空集合
		c.clear();
		// 输出集合元素的个数
		System.out.println(c.size());
		// 输出集合是否不包含任何元素
		System.out.println(c.isEmpty());

	}

}
