package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map Map看起来是一个多行两列的表格. 以key-value对的形式存放元素
 * 在Map中Key不能重复(重复是依靠key的equals判断) 常用的实现类是:HasMap
 * 
 * @author L
 *
 */
public class MapDemo1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();// 创建一个hasmap集合
		// 添加元素
		/*
		 * V put(K k ,V v) 将给定的key-value对存入Map
		 * 由于map要求key不能重复,所以使用map已有的key存入一个新的value的操作是替换value
		 * 那么返回值为该key原来对应的value,若是一个新的key,返回值为null
		 */
//		int value = map.put("语文", 98);自动拆箱 null.intValue()
		Integer value = map.put("语文", 99);
		map.put("数学", 98);
		map.put("英语", 97);
		map.put("物理", 96);
		map.put("化学", 99);
		System.out.println(map);
		
		value = map.put("语文", 98);//替换
		System.out.println(map);
		System.out.println(value);
		
		/*
		 * V get (K k)
		 * 根据给定的key获取对应的value
		 * 若当前map没有给定的key 返回值为null
		 */
		value =map.get("熟悉");//获取key对应的value
		System.out.println(value);
		value =map.get("数学");//获取key对应的value
		System.out.println(value);
		
		/*
		 * V remove(K k)
		 * 删除给定的key对应的key-value对
		 * 返回值为被删除的key-value对的value
		 */
		
		System.out.println("删除数学");
		value = map.remove("数学");//删除数学key-value
		System.out.println(map);
		System.out.println("old:"+value);
	}

}
