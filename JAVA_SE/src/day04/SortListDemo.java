package day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 排序集合元素 排序集合是所有集合的工具类Collection的静态方法sort, 排序仅对List集合进行,因为Set集合大部分实现是无序的
 * 
 * @author L
 *
 */
public class SortListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();// 创建集合
		Random random = new Random();// 创建随机类
		for (int i = 0; i < 10; i++) {
			list.add(random.nextInt(100));// 随机生成100以内的整数并添加到集合
		}
		System.out.println(list);
		/*
		 * 对集合排序,从小到大 用Collections
		 */
		Collections.sort(list);
		System.out.println(list);

	}

}
