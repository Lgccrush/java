package day02;
/**
 * 字符串支持正则表达式方法二:
 * String[] split(String regex)
 * 将当前字符串按照满足正则表达式的部分进行拆分
 * 返回拆分后的每段内容
 * @author L
 *
 */
public class StringDemo1 {

	public static void main(String[] args) {
		//按照数字拆分,保留所有的英文字母部分
		String str = "abc123def456ghi789jkl";
		String regex = "[0-9]+";//定义数字正则表达式
//		String regex = "[0-9]";//没有+会切出空字符串
		String[] split = str .split(regex);//切分目标字符串数字部分
		System.out.println(split.length);
		for (int i = 0; i < split.length; i++) {//遍历
			System.out.println(split[i]);
		}
	}

}
