package day04Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ����һ������c1,���Ԫ��"one","tow","three", �ٴ���һ������c2,���Ԫ��"four","five","six"
 * Ȼ��c2��Ԫ��ȫ�������c1������ Ȼ���ٴ�������c3,���Ԫ��"one","five", Ȼ���������c1�Ƿ����c3������Ԫ��
 * Ȼ���c1�����е�"two"ɾ���������c1����
 * 
 * @author L
 *
 */
public class day04Test1 {

	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<String>();// ��������C1
		// ���Ԫ��
		c1.add("one");
		c1.add("tow");
		c1.add("three");

		Collection<String> c2 = new ArrayList<String>();// ��������C2
		// ���Ԫ��
		c1.add("four");
		c1.add("five");
		c1.add("six");
		c1.addAll(c2);// ��c2ȫ��Ԫ����ӵ�C1
		System.out.println(c1);
		Collection<String> c3 = new ArrayList<String>();// ��������C3
		// ���Ԫ�ص�C3������
		c3.add("one");
		c3.add("five");
		System.out.println(c3);
		boolean b = c1.contains(c3);// �ж�C1�����Ƿ����c3
		System.out.println("c1���ϰ���C3������:" + b);
		c1.remove("tow");
		System.out.println(c1);
	}

}
