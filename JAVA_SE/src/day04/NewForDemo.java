package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ��ѭ����������
 * 
 * @author L
 *
 */
public class NewForDemo {

	public static void main(String[] args) {
		Collection c = new ArrayList();// ����һ������
		// ���Ԫ��
		c.add("one");
		c.add("#");
		c.add("tow");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		System.out.println(c);// ��ӡ����
		for (Object o : c) {// ��ѭ����������
			String str = (String) o;
			/*
			 * ��ѭ�������µ��﷨,��ѭ���Ǳ������Ͽ�,������������Ͽ� ʹ����ѭ����������ʱ,�������Ὣ����Ϊ��������ʽ����
			 * ������ʹ����ѭ��ʱ,����ͨ�����ϵķ�ʽ��ɾԪ��
			 */
			if ("#".equals(str)) {
				// c.remove(str);

			}

			System.out.println(str);
		}

	}

}
