package day04Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * ����һ��list���ϲ����10�������,Ȼ������ü��ϲ����
 * 
 * @author L
 *
 */
public class day04Test7 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();// ����һ��integer����
		Random random = new Random();// �����������
		for (int i = 0; i < 10; i++) {// ���10�������������
			int n = random.nextInt(100);
			list.add(n);
		}
		System.out.println(list);
		Collections.sort(list);// �Ѽ�������
		System.out.println(list);
		for (Integer integer : list) {// ��ѭ����������
			System.out.print(integer + " ");
		}
	}
}
