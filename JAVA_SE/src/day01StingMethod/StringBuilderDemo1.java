package day01StingMethod;

import javax.print.attribute.standard.Sides;

/**
 * StringBuilder提供了用于修改字符串内容的相关方法
 * 其内部维护的是一个可变的字符数组,
 * 所以修改都是在当前对象内部完成的
 * 当频繁修改字符串内容时应当使用当前类完成
 * @author L
 *
 */
public class StringBuilderDemo1 {

	public static void main(String[] args) {
		String s1 = "努力学习Java";
		/*
		 * 将String转换为Stringbuilder
		 * 可以使用有参的构造方法
		 * StringBuilder也有无参构造方法,默认表示空字符串
		 */
		StringBuilder sBuilder = new StringBuilder(s1);
		
		/*
		 * 从StringBuilder转换为String
		 * 使用StringBuilder方法即可
		 */
		
		String s2 = sBuilder.toString();
		
		/*
		 * StringBuilder append(String str)
		 * 向当前字符串末尾追加指定内容
		 * 有若干重载方法,参数类型不同,这些重载方法允许追加其他内容
		 * (先转换为字符串再追加)
		 * 
		 */
		sBuilder.append(",为了找个好工作");
		System.out.println(sBuilder.toString());
		
		/*
		 * StringBuild replace(int strat,int end,String str)
		 * 将指定范围内的字符串替换为指定的内容
		 * 包含头不包含尾
		 * 努力学习java,为了找个好工作
		 * 改为
		 *努力学习java,就是为了改变世界 
		 */
		sBuilder.replace(9, 16, "就是为了改变世界");
		System.out.println(sBuilder.toString());
		
		
		/*
		 * StringBuilder delete(int start,int end)
		 * 将当前字符串中指定范围内的内容删除
		 *  努力学习java,就是为了改变世界 
		 * 改为
		 *  ,就是为了改变世界 
		 */
		sBuilder.delete(0, 8);
		System.out.println(sBuilder.toString());
		
		
		/*StringBuilder insert(int index,String str)
		 * 将给定字符串插入指定位置
		 * 原位置及后续字符串顺序向后移动
		 * ,就是为了改变世界 
		 * 改为
		 *活着,就是为了改变世界 
		 */
		sBuilder.insert(0, "活着");
		System.out.println(sBuilder.toString());
		/*
		 * 反转字符串
		 * StringBuilder reverse()
		 */
		sBuilder.reverse();
		System.out.println(sBuilder.toString());
	}
}
