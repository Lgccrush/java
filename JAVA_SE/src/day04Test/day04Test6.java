package day04Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 创建一个字符串数组{"one""two""three"} 然后就数组转换为一个list集合
 * 
 * @author L
 *
 */
public class day04Test6 {

	public static void main(String[] args) {
		String[] str = { "one", "tow", "three" };
		List<String> list = Arrays.asList(str);
		System.out.println(list);
	}

}
