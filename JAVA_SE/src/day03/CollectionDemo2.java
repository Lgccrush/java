package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * ���ϴ��Ԫ���Ǵ��Ԫ�ص�����(��ַ)
 * 
 * @author L
 *
 */
public class CollectionDemo2 {

	public static void main(String[] args) {
		Collection c = new ArrayList();// ����һ������
		Point point = new Point(1, 2);// ����point����
		c.add(point);// ��point������ӵ�����
		System.out.println(point);
		System.out.println(c);
		point.setx(2);// ����point����X��ֵ
		System.out.println(point);
		System.out.println(c);
	}

}
