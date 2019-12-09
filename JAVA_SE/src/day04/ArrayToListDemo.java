package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转为集合 需要注意,转换只能转换为List集合 使用的是数组工具类Arrays的静态方法asList
 * 只能转换为List的主要原因是:set不能存放重复元素 所以若转换为Set集合可能出现元素丢失的情况
 * 
 * @author L
 *
 */
public class ArrayToListDemo {

	public static void main(String[] args) {
		String[] array = { "one", "tow", "three", "four" };// 创建一个数组

		List<String> list = Arrays.asList(array);// 把数组转换为集合
		System.out.println(list);
		// 向集合添加元素
		/*
		 * 下面代码会抛出异常,原因在于该集合时数组转换的 该集合表示原数组,所以对集合的操作就是对数组的操作
		 * 那么添加元素会导致数组扩容,那么就不能表示原来的数组 所以不允许向该集合添加新的元素
		 */
		// list.add("five");
		// System.out.println(list);
		// 修改集合元素
		list.set(1, "2");
		System.out.println(list);
		// 修改集合元素,数组也会修改
		for (String string : array) {
			System.out.println(string);
		}
		/*
		 * 若希望增删元素,需要另外创建新集合
		 */
		// List<String> list2 = new ArrayList<String>();
		// list2.addAll(list);
		/*
		 * 所有的集合都提供了一个带有Collection 类型参数的构造方法 该构造方法称作为:复制构造器
		 * 作用是创建该集合的同时,集合包含给定集合的所有元素
		 */
		List<String> list2 = new ArrayList<String>(list);
		list2.add("five");
		System.out.println(list2);
	}

}
