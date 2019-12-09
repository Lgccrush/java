package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List 可重复集,并且有序 特点是可以使用下标操作元素: 常用实现类 ArrayList:使用数组实现,查询更快
 * LinkdList:使用链表实现,增删更快(首尾增删效果明显)
 * 
 * @author L
 *
 */
public class ListDemo1 {

	public static void main(String[] args) {
		/*
		 * E set(int index,E e) 将给定元素设置到给定位置上,返回值为原位置的元素 所以是替换元素操作
		 */
		List<String> list = new ArrayList<String>();// 创建一个集合
		list.add("one");// 添加元素
		list.add("tow");
		list.add("three");
		list.add("four");
		// [one, tow, three, four]
		System.out.println(list);
		String old = list.set(1, "2");// 返回被替换的字符串
		System.out.println(list);
		System.out.println(old);
		// [one, tow, three, four,five]
		// list.set(4, "five");这样会下标越界

		/*
		 * E get(int index) 获取给定下标所对应的元素
		 */
		// 获取第三个元素
		String str = list.get(2);
		System.out.println(str);

		for (int i = 0; i < 4; i++) {
			System.out.println(i);
		}

	}

}
