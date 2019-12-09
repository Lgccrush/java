package day02test;

import java.util.Scanner;

/**
 * API 第二天练习
 * 
 * @author L
 *
 */
public class Test2 {

	public static void main(String[] args) {
		/*
		 * 输出一个字符串,然后若该字符串是一个整数,则转换为整数后输出乘以10后的结果 若是小数,则转换为一个小数输出乘以5后的结果
		 * 若不是数字输出不是数字 需要用正则表达式进行判断
		 */
		Scanner scanner = new Scanner(System.in);//键盘录入
		System.out.println("请您输入");//提示语
		String line = scanner.nextLine();//接受键盘录入
		String intRegex = "[0-9]+";//定义整数正则表达式
		String douRegex2 = "[0-9]+\\.[0-9]+";//定义小数正则表达式
		if (line.matches(intRegex)) {//匹配整数
			System.out.println("您输入的是" + line + ",乘以10后结果是"
					+ Integer.parseInt(line) * 10);
		} else if (line.matches(douRegex2)) {//匹配小数
			System.out.println("您输入的是" + line + ",乘以5后结果是"
					+ Double.parseDouble(line) * 5);
		} else {
			System.out.println("您输入的不是数字");
		}

		//将字符串"123,456,789,012"根据","拆分,并输出拆分后的每一项
		String string = "123,456,789,012";
		String regex = "[,]";//定义正则表达式
		String[] strings = string.split(regex);//切割字符串
		for (int i = 0; i < strings.length; i++) {//遍历字符串
			System.out.println(strings[i]);//输出
			
		}
		
		//将字符串"123abc456def789ghi"中的英文字母部分替换为"#char#"
		String string2 = "123abc456def789ghi";//定义字符串
		String regex1 = "[a-z]+";//定义正则表达式
		String string3 = string2.replaceAll(regex1, "#char#");//替换
		System.out.println("string3:"+string3);
		
	}
}