package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List ���ظ���,�������� �ص��ǿ���ʹ���±����Ԫ��: ����ʵ���� ArrayList:ʹ������ʵ��,��ѯ����
 * LinkdList:ʹ������ʵ��,��ɾ����(��β��ɾЧ������)
 * 
 * @author L
 *
 */
public class ListDemo1 {

	public static void main(String[] args) {
		/*
		 * E set(int index,E e) ������Ԫ�����õ�����λ����,����ֵΪԭλ�õ�Ԫ�� �������滻Ԫ�ز���
		 */
		List<String> list = new ArrayList<String>();// ����һ������
		list.add("one");// ���Ԫ��
		list.add("tow");
		list.add("three");
		list.add("four");
		// [one, tow, three, four]
		System.out.println(list);
		String old = list.set(1, "2");// ���ر��滻���ַ���
		System.out.println(list);
		System.out.println(old);
		// [one, tow, three, four,five]
		// list.set(4, "five");�������±�Խ��

		/*
		 * E get(int index) ��ȡ�����±�����Ӧ��Ԫ��
		 */
		// ��ȡ������Ԫ��
		String str = list.get(2);
		System.out.println(str);

		for (int i = 0; i < 4; i++) {
			System.out.println(i);
		}

	}

}
