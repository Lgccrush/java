package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供了一对重载的add,remove方法 void add(int index,E e) 将给定元素插入到指定位置
 * 
 * E remove(int index) 从集合中删除指定的元素,并将其返回
 * 
 * @author L
 *
 */
public class ListDemo2 {

	public static void main(String[] args) {
		// 创建一个list集合
		List<String> list = new ArrayList<String>();
		// 添加元素
		list.add("one");
		list.add("tow");
		list.add("three");
		list.add("four");
		// [one, tow, three, four]

		System.out.println(list);
		list.add(1, "2");// 在下标为1的位置添加"2"
		System.out.println(list);

		// [one, 2, three, four]
		String oldString = list.remove(2);// 删除坐标为2的元素并替换
		System.out.println(list);// 被删除元素被返回
		System.out.println(oldString);

	}

}
