package day01StingMethod;
/**
 * boolean stratWhith(String str)
 * boolean endWhith(String str)
 * 判断当前字符串是否以指定字符串开始或者结尾的
 * @author L
 *
 */
public class StringDemo6 {

	public static void main(String[] args) {
		String string = "thinking in java";
		boolean b1 = string.startsWith("t");
		boolean b = string.endsWith("va");
		System.out.println(b);
		System.out.println(b1);
	}

}
