package day02;
/**
 * 字符串支持正则表达式方法三:
 * String replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为给定的字符串
 * @author L
 *
 */
public class StringDemo3 {

	public static void main(String[] args) {
		String str = "abc123def456ghi789jkl";
		//将数字部分替换为#NUMBER#
		String str2 = str.replaceAll("[\\d]", "#NUMBER#");//替换
		System.out.println(str2);
	}

}
