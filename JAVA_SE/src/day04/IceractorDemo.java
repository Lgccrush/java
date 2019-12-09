package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import day02.Point;

/**
 * �������� Collection�ṩ��һ��ͳһ�ı������ϵķ�ʽ ������ģʽ Iterator iterator() ��ȡ���ڱ�����ǰ���ϵĵ�����
 * java.util.Iterator��һ���ӿ� �涨�˱���������Ԫ�ص���ط��� ��ͬ�����ṩ����Ӧ��ʵ����
 * �����ס��Щʵ���������,ֻ�����ǵ���Iterator���� ����������ѭ��,ȡ,ɾ�Ĳ���,����ɾ�����Ǳ������
 * 
 * @author L
 *
 */
public class IceractorDemo {

	public static void main(String[] args) {
		Collection c = new ArrayList();// ����һ������
		// ���Ԫ��
		c.add("One");
		c.add("#");
		c.add("Two");
		c.add("#");
		c.add("Three");
		c.add("#");
		Iterator i = c.iterator();// ��ȡ������
		while (i.hasNext()) {// ����
			String str = (String) i.next();// ����ǿת
			if ("#".equals(str)) {
				// c.remove("#");�ڵ�������������ʱ,�����ü��ϵķ�ʽȥ����Ԫ��

				i.remove();// �õ������ķ���ɾ��next����ȡ����Ԫ��
			}
			System.out.println(str);
		}
		System.out.println(c);
	}

}
