package day02;
/**
 * 字符串支持正则表达式的方法一:
 * boolean matches(String regex)
 * 根据给定的正则表达式验证当前字符串是否满足格式要求
 * 满足返回true,否则返回false
 * 
 * @author L
 *
 */
public class StringDemo {

	public static void main(String[] args) {
		
		/*
		 * 电子信箱的正则表达式:
		 * [a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\.[a-zA-Z0-9_]+)+
		 */
		String str ="[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z0-9_]+)+";
		String email = "heima@qq.com";
		boolean b = email.matches(str);
		if (b) {
			System.out.println("是邮箱");
		} else {
			System.out.println("不是邮箱");
		}
	}

}
