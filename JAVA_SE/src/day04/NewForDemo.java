package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 新循环遍历集合
 * 
 * @author L
 *
 */
public class NewForDemo {

	public static void main(String[] args) {
		Collection c = new ArrayList();// 创建一个集合
		// 添加元素
		c.add("one");
		c.add("#");
		c.add("tow");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		System.out.println(c);// 打印集合
		for (Object o : c) {// 新循环遍历集合
			String str = (String) o;
			/*
			 * 新循环并非新的语法,新循环是编译器认可,而不是虚拟机认可 使用新循环遍历集合时,编译器会将它改为迭代器方式遍历
			 * 所以在使用新循环时,不能通过集合的方式增删元素
			 */
			if ("#".equals(str)) {
				// c.remove(str);

			}

			System.out.println(str);
		}

	}

}
