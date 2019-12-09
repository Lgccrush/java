package day04;

/**
 * JDK5.0之后推出了一个新特性 增强for循环,又叫做新循环,for each 新循环不能替代传统循环,作用仅仅用来遍历集合和数组的
 * 
 * @author L
 *
 */
public class NewForDemo1 {

	public static void main(String[] args) {
		String[] array = { "one", "tow", "three", "four" };// 创建字符串数组
		for (int i = 0; i < array.length; i++) {// 传统循环遍历
			System.out.println(array[i]);
		}
		for (String str : array) {// 新循环遍历
			System.out.println(str);
		}
	}

}
