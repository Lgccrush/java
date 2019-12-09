package day01test;

/**
 * API第一天练习
 * 
 * @author L
 *
 */
public class Test {

	public static void main(String[] args) {
		String string = "HelloWorld";
		// 输出字符串"HelloWorld"的字符串长度
		int leng = string.length();
		System.out.println("leng:" + leng);
		// 输出字符串"HelloWorld"中"O"的位置
		int index = string.indexOf("o");
		System.out.println("index:" + index);
		// 输出字符串"HelloWorld"中从下标5处开始第一次出现"O"的位置
		int index1 = string.indexOf("o", 5);
		System.out.println("index1:" + index1);
		// 截取字符串"HelloWorld"中的"Hello"并输出
		String sub = string.substring(0, 5);
		System.out.println("sub:" + sub);
		// 截取字符串"HelloWorld"中的"World"并输出
		String sbu2 = string.substring(5);
		System.out.println("sub2:" + sbu2);
		// 将字符串" Hello "中两边空白去除并输出
		String string2 = "  Hello  ";
		String str1 = string2.trim();
		System.out.println("str1=" + str1);
		// 输出字符串"HelloWorld"中第六个字符"W"
		char c = string.charAt(5);
		System.out.println("c:" + c);
		// 输出字符串"HelloWorld"是否是以"H"开头和"ld"结尾的
		boolean flag1 = string.startsWith("H");
		boolean flag2 = string.endsWith("ld");
		System.out.println("flag1:" + flag1);
		System.out.println("flag2:" + flag2);
		// 将"HelloWorld"分别转换为全大写和全小写并输出
		String string3 = string.toUpperCase();
		String string4 = string.toLowerCase();
		System.out.println("string3:" + string3);
		System.out.println("string4:" + string4);
	}

}
