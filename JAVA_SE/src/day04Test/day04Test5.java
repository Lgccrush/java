package day04Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ����һ������list �����Ԫ��0-9 ������ת��Ϊһ��integer���鲢�������ÿһ��Ԫ��
 * 
 * @author L
 *
 */
public class day04Test5 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();// ��������
		// ���Ԫ��0-9
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		Integer[] integers = list.toArray(new Integer[list.size()]);// ������ת��ΪIntrger����
		for (int i = 0; i < integers.length; i++) {// ����Integer����
			System.out.println(integers[i]);
		}
	}

}
