package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * jav.util.Collection ����,���ڴ洢һ��Ԫ��,�ṩ��ά�����ϵ���ز��� �������������ӿ� List:���ظ��� Set:�����ظ���
 * Ԫ���Ƿ��ظ��Ǹ���Ԫ�ر���equals�����Ƚ϶���
 * 
 * @author L
 *
 */
public class CollectionDemo {

	public static void main(String[] args) {
		Collection c = new ArrayList();// ��������
		/*
		 * boolean add(E e) �򼯺������Ԫ�� ��Ԫ�سɹ���ӵ����Ϸ���true ��������Ӳ�ͬ���͵�����
		 * (��������ȥ���й���Ĺ����)
		 */
		c.add("one");// ���Ԫ��
		c.add("Tow");// ���Ԫ��
		c.add("Three");// ���Ԫ��
		System.out.println(c);
		/*
		 * int size() ���ص�ǰ����Ԫ�ظ���
		 */
		System.err.println("size:" + c.size());
		/*
		 * boolean isEmpty() �жϼ����Ƿ񲻰����κ�Ԫ�� �ռ���
		 */
		boolean flag = c.isEmpty();// �ж�
		System.out.println("�Ƿ��ǿռ���:" + flag);
		/*
		 * void clear() ��ռ����е�����Ԫ��
		 */
		System.out.println("��ռ���");
		c.clear();// ��ռ���
		System.out.println("sizi:" + c.size());// ��ȡԪ�ظ���
		System.out.println("�Ƿ��ǿռ���:" + c.isEmpty());// �ж��Ƿ�Ϊ��

	}

}
