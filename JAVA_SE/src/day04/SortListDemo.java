package day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * ���򼯺�Ԫ�� ���򼯺������м��ϵĹ�����Collection�ľ�̬����sort, �������List���Ͻ���,��ΪSet���ϴ󲿷�ʵ���������
 * 
 * @author L
 *
 */
public class SortListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();// ��������
		Random random = new Random();// ���������
		for (int i = 0; i < 10; i++) {
			list.add(random.nextInt(100));// �������100���ڵ���������ӵ�����
		}
		System.out.println(list);
		/*
		 * �Լ�������,��С���� ��Collections
		 */
		Collections.sort(list);
		System.out.println(list);

	}

}
