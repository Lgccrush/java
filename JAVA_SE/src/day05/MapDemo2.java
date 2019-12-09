package day05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 遍历Map
 * 有3种方式
 * 遍历所有的key
 * 遍历所有的key-value对
 * 遍历所有的value(不常用)
 * @author L
 *
 */
public class MapDemo2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();//创建map集合
		//添加元素
		map.put("语文", 99);
		map.put("数学", 98);
		map.put("英语", 97);
		map.put("物理", 96);
		map.put("化学", 99);
		System.out.println(map);
		
		/*
		 * 遍历所有的kye
		 * set<k> keySet
		 * 该方法会将当前map中所有的key存入一个set集合后返回,
		 * 那么遍历集合就相当于遍历了所有的key
		 */
		Set<String> keysSet = map.keySet();//得到集合中所有的key存在set集合中
		for (String key: keysSet) {
			System.out.println("key:"+key);
		}
		/*
		 * 遍历每一组键值对
		 * map中每一组键值对都是由map的内部类:
		 * java.util.Map.Entry的每一个实例表示的
		 * Entry有两个方法:getKey getVelue,
		 * 可以分别这一组键值对中的key和velue
		 * 
		 * Set<Entry>entrySet
		 * 该方法会将Map中每一个键值对(entry实例)
		 * 存入一个Set集合返回
		 */
		//将map的键值对存在set集合中
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {//遍历集合 得到每一个键值对
			String key = entry.getKey();
			Integer velue = entry.getValue();
			System.out.println("key:"+key+"velue:"+velue);
		}
		/*
		 * 遍历所有的value
		 * Collection values
		 * 该方法会将当前Map中所有的value存入一个集合后返回
		 */
		Collection<Integer> values = map.values();//获取所有的value
		//遍历
		for (Integer value : values) {
			System.out.println(value);
		}
	}

}
