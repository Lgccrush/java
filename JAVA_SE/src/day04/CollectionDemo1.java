package day04;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * ɾ������Ԫ��
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
		System.out.println(c);// ��ӡ����Ԫ��
		/*
		 * boolean remove(E e) �Ӽ�����ɾ��ָ��Ԫ��,ɾ���ɹ�����true
		 * ֻɾ�����ϵ�һ�������Ԫ��equals�Ƚ�Ϊtrue��Ԫ��
		 */
		c.remove(new Point(1, 2));// ɾ��ָ��Ԫ��
		System.out.println(c);// �ٴδ�ӡ����Ԫ��
	}

}
