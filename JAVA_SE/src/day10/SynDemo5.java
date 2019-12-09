package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 将集合或map转换为线程安全的
 * 
 * API手册上有说明,就算线程安全的集合,
 * 其中对于元素的操作,如add,remove,等方法不予迭代器遍历做互斥,
 * 需要自行维护互斥关系
 * @author L
 *
 */
public class SynDemo5 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("fore");
		
		 list = Collections.synchronizedList(list);//把集合转换为线程安全的
		 
		 Set<String> set = new HashSet<String>(list);//构造方法重造集合
		 set = Collections.synchronizedSet(set);//把set集合转换为线程安全的
		 //HashMap不是线程安全的
		 Map< String, Integer > map = new HashMap<String, Integer>();
		 map.put("语文", 99);
		 map.put("数学", 98);
		 map.put("英语", 97);
		 map = Collections.synchronizedMap(map);//把map转换成线程安全的
	}

}
