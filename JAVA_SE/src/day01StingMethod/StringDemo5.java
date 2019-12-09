package day01StingMethod;
/**
 * char charAt(int index)
 * 获取当前字符串指定下标对应的字符
 * @author L
 *
 */
public class StringDemo5 {

	public static void main(String[] args) {
		String string = "thinking in java";
		//查找第五个字符是什么
		char c = string.charAt(4);
		System.out.println("第五个字符是"+c);
		
		/*
		 * 检查一个字符串是否为回文(倒着念正着念一样)
		 */
		String string2 = "上海自来水来自海上";
		for (int i = 0; i < string2.length()/2; i++) {
			if (string2.charAt(i)!=string2.charAt(string2.length()-i-1)) {
				System.out.println("不是回文");
				return;
			}
		}
		System.out.println("是回文");
		
	}

}
