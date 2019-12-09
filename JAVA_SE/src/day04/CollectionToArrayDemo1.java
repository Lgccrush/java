package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合转换为数组
 * 
 * @author L
 *
 */
public class CollectionToArrayDemo1 {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();// 创建一个集合
		// 向集合添加元素
		c.add("one");
		c.add("tow");
		c.add("three");
		c.add("four");
		System.out.println(c);// 查看集合中元素
		/*
		 * 集合提供了方法toAraay 可以将当前集合转换为数组 若给定的数组可用(数组可以存放集合所有元素)时则使用该数组
		 * 若不可用,会自动创建一个与给定数组相同类型的数组
		 */
		String[] array = c.toArray(new String[c.size()]);// 将集合转为数组
		System.out.println(array.length);// 获取数组长度
		for (int i = 0; i < array.length; i++) {// 遍历数组
			System.out.println(array[i]);
		}
	}

}
