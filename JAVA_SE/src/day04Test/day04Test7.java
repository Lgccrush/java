package day04Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 创建一个list集合并存放10个随机数,然后排序该集合并输出
 * 
 * @author L
 *
 */
public class day04Test7 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();// 创建一个integer集合
		Random random = new Random();// 创建随机数类
		for (int i = 0; i < 10; i++) {// 添加10个随机数到集合
			int n = random.nextInt(100);
			list.add(n);
		}
		System.out.println(list);
		Collections.sort(list);// 把集合排序
		System.out.println(list);
		for (Integer integer : list) {// 新循环遍历集合
			System.out.print(integer + " ");
		}
	}
}
