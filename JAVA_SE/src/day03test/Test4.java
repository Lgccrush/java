package day03test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ��ϰ
 * 
 * @author L
 *
 */
public class Test4 {

	public static void main(String[] args) {
		// ����һ������,����ַ���"one","tow","three",
		Collection c = new ArrayList();
		c.add("one");
		c.add("tow");
		c.add("three");
		// ����ü��ϵ�Ԫ�ظ���
		System.out.println(c.size());
		// ����ü����Ƿ�����ַ���"four"
		boolean b = c.contains("four");
		System.out.println(b);
		// ��������Ƿ񲻰����κ�Ԫ��
		System.out.println(c.isEmpty());
		// ��ռ���
		c.clear();
		// �������Ԫ�صĸ���
		System.out.println(c.size());
		// ��������Ƿ񲻰����κ�Ԫ��
		System.out.println(c.isEmpty());

	}

}
