package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * boolean contains(E e) �жϵ�ǰ�����Ƿ��������Ԫ��
 * 
 * @author L
 *
 */
public class CollectionDemo1 {

	public static void main(String[] args) {
		Collection c = new ArrayList();// ��������
		// ���Ԫ��
		c.add(new Point(1, 2));
		c.add(new Point(3, 4));
		c.add(new Point(5, 6));
		System.out.println(c);
		/*
		 * �����ж��Ƿ����ָ��Ԫ���Ǹ���Ԫ��equals�ȽϵĽ�� ֻҪ������Ԫ�غ͸���Ԫ�رȽ�Ϊtrue,����Ϊ����
		 */
		Point point = new Point(1, 2);// ����point����
		// System.out.println(point);
		boolean b = c.contains(point);// �жϼ����Ƿ����
		System.out.println(b);

	}

}
