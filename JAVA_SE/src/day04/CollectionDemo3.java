package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ����֧�ַ���,����������Լ��������Ԫ�ص�����
 * 
 * @author L
 *
 */
public class CollectionDemo3 {

	public static void main(String[] args) {
		// ����һ������,ֻ�ܴ����ַ�������
		Collection<String> c = new ArrayList<String>();
		// �򼯺����Ԫ��
		c.add("one");
		c.add("tow");
		c.add("three");
		c.add("four");
		// ��������Ԫ��
		for (String string : c) {
			System.out.println(string);
		}
		/*
		 * ������ҲӦ��ָ������,�����͵�ʵ������Ӧ������ �����ļ��ϵķ�������һ��
		 */
		Iterator<String> i = c.iterator();// ��ȡ������
		while (i.hasNext()) {// ʹ�õ�������������
			String str = (String) i.next();// ��ȡԪ��ʱ����Ҫ������
			System.out.println(str);
		}
	}

}
