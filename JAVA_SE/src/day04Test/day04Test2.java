package day04Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 创建一个集合,存放元素"1","$","2","$","3","$","4", 使用迭代器遍历集合,并在过程中删除所有"$"
 * 最后将删除元素的集合使用新循环遍历,并输出每一个元素
 * 
 * @author L
 *
 */
public class day04Test2 {

	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<String>();// 创建集合C1
		// 添加元素
		c1.add("1");
		c1.add("$");
		c1.add("2");
		c1.add("$");
		c1.add("3");
		c1.add("$");
		c1.add("4");
		Iterator<String> i1 = c1.iterator();// 获取迭代器
		while (i1.hasNext()) {// 遍历
			String str1 = (String) i1.next();
			if ("$".equals(str1)) {// 判断并删除元素"$"
				i1.remove();
			}
		}
		System.out.println(c1);// 得到新的集合
	}

}
