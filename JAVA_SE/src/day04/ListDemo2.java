package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * List�ṩ��һ�����ص�add,remove���� void add(int index,E e) ������Ԫ�ز��뵽ָ��λ��
 * 
 * E remove(int index) �Ӽ�����ɾ��ָ����Ԫ��,�����䷵��
 * 
 * @author L
 *
 */
public class ListDemo2 {

	public static void main(String[] args) {
		// ����һ��list����
		List<String> list = new ArrayList<String>();
		// ���Ԫ��
		list.add("one");
		list.add("tow");
		list.add("three");
		list.add("four");
		// [one, tow, three, four]

		System.out.println(list);
		list.add(1, "2");// ���±�Ϊ1��λ�����"2"
		System.out.println(list);

		// [one, 2, three, four]
		String oldString = list.remove(2);// ɾ������Ϊ2��Ԫ�ز��滻
		System.out.println(list);// ��ɾ��Ԫ�ر�����
		System.out.println(oldString);

	}

}
