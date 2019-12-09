package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * jav.util.Collection 集合,用于存储一组元素,提供了维护集合的相关操作 其派生了两个接口 List:可重复集 Set:不可重复集
 * 元素是否重复是根据元素本身equals方法比较而定
 * 
 * @author L
 *
 */
public class CollectionDemo {

	public static void main(String[] args) {
		Collection c = new ArrayList();// 创建集合
		/*
		 * boolean add(E e) 向集合中添加元素 当元素成功添加到集合返回true 不建议添加不同类型到集合
		 * (集合类似去超市购物的购物袋)
		 */
		c.add("one");// 添加元素
		c.add("Tow");// 添加元素
		c.add("Three");// 添加元素
		System.out.println(c);
		/*
		 * int size() 返回当前集合元素个数
		 */
		System.err.println("size:" + c.size());
		/*
		 * boolean isEmpty() 判断集合是否不包含任何元素 空集合
		 */
		boolean flag = c.isEmpty();// 判断
		System.out.println("是否是空集合:" + flag);
		/*
		 * void clear() 清空集合中的所有元素
		 */
		System.out.println("清空集合");
		c.clear();// 清空集合
		System.out.println("sizi:" + c.size());// 获取元素个数
		System.out.println("是否是空集合:" + c.isEmpty());// 判断是否为空

	}

}
