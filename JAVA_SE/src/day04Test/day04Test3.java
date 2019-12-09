package day04Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合,存放"one""tow""theree""four" 获取第二个元素并输出 将集合第二个元素设置为"3" 再集合第二个位置插入"2"
 * 删除第三个元素
 * 
 * @author L
 *
 */
public class day04Test3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();// 创建list集合
		// 向集合添加元素
		list.add("one");
		list.add("tow");
		list.add("three");
		list.add("four");
		String str = list.get(1);// 获取集合第二个元素
		System.out.println(str);
		list.set(1, "3");// 把集合第二个元素设置为"3"
		System.out.println(list);
		list.add(1, "2");// 在集合第二个位置插入"2"
		System.out.println(list);
		list.remove(2);// 删除集合第三个元素
		System.out.println(list);

	}
}
