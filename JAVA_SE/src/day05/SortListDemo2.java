package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo2 {

	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();//创建string类型集合
		//添加元素
		list.add("苍老师");
		list.add("范老师");
		list.add("小泽老师");
		System.out.println(list);
//		Collections.sort(list);//元素排序
		/**
		 * 重载的sort方法要求传入一个额外的比较器,
		 * 该方法不再要求集合元素必须实现Comparable接口,
		 * 而且也不再使用集合元素自身的比较规则排序了,
		 * 而是根据这个给定的这个额外比较器的比较规则对集合元素进行排序,
		 * 实际开发中也推荐这种方式排序元素,若集合元素是自定义的,
		 * 创建比较器推荐使用匿名内部类的形式
		 */
		MyComparable com = new MyComparable();
		Collections.sort(list, com);
		System.out.println(list);
		//匿名内部类的形式创建
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1,String  o2) {
				//重写方法 字符少的大
				return o2.length()-o1.length();
			}
			
		});
		System.out.println(list);
	}

}
class MyComparable implements Comparator<String>{

	/**
	 * 该方法原来定义o1和o2 是比较
	 * 若返回值>0:o1>o2
	 * 若返回值<0:o1<o2
	 * 若返回值=0:两个对象相等
	 */
	public int compare(String o1, String o2) {
		/*
		 * 字符串中字符多的大
		 */
		return o1.length()-o2.length();
	}

	

	
	}
	

