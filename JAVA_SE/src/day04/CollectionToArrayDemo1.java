package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ����ת��Ϊ����
 * 
 * @author L
 *
 */
public class CollectionToArrayDemo1 {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();// ����һ������
		// �򼯺����Ԫ��
		c.add("one");
		c.add("tow");
		c.add("three");
		c.add("four");
		System.out.println(c);// �鿴������Ԫ��
		/*
		 * �����ṩ�˷���toAraay ���Խ���ǰ����ת��Ϊ���� ���������������(������Դ�ż�������Ԫ��)ʱ��ʹ�ø�����
		 * ��������,���Զ�����һ�������������ͬ���͵�����
		 */
		String[] array = c.toArray(new String[c.size()]);// ������תΪ����
		System.out.println(array.length);// ��ȡ���鳤��
		for (int i = 0; i < array.length; i++) {// ��������
			System.out.println(array[i]);
		}
	}

}
