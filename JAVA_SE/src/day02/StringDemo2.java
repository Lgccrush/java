package day02;
/**
 *验证手机号码的正则表达式 
 * @author L
 *
 */
public class StringDemo2 {

	public static void main(String[] args) {
		//定义手机正则表达式
		String regex ="[1]{1}[873]{1}[\\d]{9}";
		//验证手机号码
		String num = "13540493165";
		boolean flag = num.matches(regex);
		if (flag) {
			System.out.println("是手机号码");
		} else {
			System.out.println("不是手机号码");
		}
		/*
		 * 要求用户输入一个手机号码
		 * 然后经过验证是否是手机号码
		 */
		
	}

}
