package day04Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 创建一个集合c1,存放元素"one","tow","three", 再创建一个集合c2,存放元素"four","five","six"
 * 然后将c2的元素全部存放如c1集合中 然后再创建集合c3,存放元素"one","five", 然后输出集合c1是否包含c3的所有元素
 * 然后就c1集合中的"two"删除后再输出c1集合
 * 
 * @author L
 *
 */
public class day04Test1 {

	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<String>();// 创建集合C1
		// 添加元素
		c1.add("one");
		c1.add("tow");
		c1.add("three");

		Collection<String> c2 = new ArrayList<String>();// 创建集合C2
		// 添加元素
		c1.add("four");
		c1.add("five");
		c1.add("six");
		c1.addAll(c2);// 把c2全部元素添加到C1
		System.out.println(c1);
		Collection<String> c3 = new ArrayList<String>();// 创建集合C3
		// 添加元素到C3集合中
		c3.add("one");
		c3.add("five");
		System.out.println(c3);
		boolean b = c1.contains(c3);// 判断C1集合是否包含c3
		System.out.println("c1集合包含C3集合吗:" + b);
		c1.remove("tow");
		System.out.println(c1);
	}

}
