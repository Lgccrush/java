package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 取子集 List suList(int start,int end) 获取当前集合中指定范围内的子集,包含头不包含尾
 * 
 * @author L
 *
 */
public class ListDemo3 {

	public static void main(String[] args) {
		// 创建一个集List集合
		List<Integer> list = new ArrayList<Integer>();
		// 添加元素0-9
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		// 获取#3-7
		List<Integer> subList = list.subList(3, 8);
		System.out.println(list);
		System.out.println(subList);

		// 把每个元素扩大10倍
		for (int i = 0; i < subList.size(); i++) {// 遍历集合
			int n = subList.get(i);// 把集合每个元素取出
			n = n * 10;// 然后扩大10倍
			subList.set(i, n);// 把每个元素放回
		}
		System.out.println(subList);// 得到扩大10倍新集合
		/*
		 * 对子集的修改,就是修改原集合的相应内容
		 */
		System.out.println(list);// 截取前集合也被修改
		/*
		 * 删除集合部分元素 要求:删除集合2-8
		 */
		list.subList(2, 9).clear();// 用原集合截取部分再清空
		System.out.println(list);// 得到截取后的集合
	}

}
