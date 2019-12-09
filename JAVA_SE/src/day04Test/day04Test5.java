package day04Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个集合list 并添加元素0-9 将集合转换为一个integer数组并输出数组每一个元素
 * 
 * @author L
 *
 */
public class day04Test5 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();// 创建集合
		// 添加元素0-9
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		Integer[] integers = list.toArray(new Integer[list.size()]);// 将集合转换为Intrger数组
		for (int i = 0; i < integers.length; i++) {// 遍历Integer数组
			System.out.println(integers[i]);
		}
	}

}
