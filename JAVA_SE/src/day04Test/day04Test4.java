package day04Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9 然后取子集[3,4,5,6] 然后将子集元素扩大10倍 然后输出原集合 之后删除集合中的[7,8,9]
 * 
 * @author L
 *
 */
public class day04Test4 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();// 创建list集合
		for (int i = 0; i < 10; i++) {
			list.add(i);// 向集合添加元素0-9
		}
		System.out.println(list);
		List<Integer> sublist = list.subList(3, 7);// 获取子集
		System.out.println(sublist);
		for (int i = 0; i < sublist.size(); i++) {// 遍历并把元素扩大10倍
		// int n = sublist.get(i);
		// n = n *10;
		// sublist.set(i, n);
			sublist.set(i, sublist.get(i) * 10);
		}
		System.out.println(list);// 新集合元素也改变
		list.removeAll(list.subList(7, 10));// 删除[7,8,9]
		System.out.println(list);

	}

}
