package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * �����Զ������͵ļ���
 * 
 * @author L
 *
 */
public class SortListDemo1 {

	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();// ����point���͵�list����
		// ���pointʵ����list������
		list.add(new Point(4, 2));
		list.add(new Point(2, 3));
		list.add(new Point(1, 4));
		list.add(new Point(6, 7));
		list.add(new Point(9, 3));
		list.add(new Point(8, 1));
		/*
		 * sort����Ҫ�󼯺�Ԫ�ر���ʵ��Comparable�ӿ�,�ýӿ����ڹ涨ʵ�����ǿ��ԱȽϵ�,����һ�����󷽷���������Ƚϴ�С�Ĺ���
		 * ������ʹ��sort�������򼯺� ���Ǹ÷���Ҫ�����Ǳ���ʵ��Comparable���ɲ��Ҷ���ȽϹ���
		 * ����������ʹ��ĳ������,����Ҫ�����޸ĳ�����������"������" �޸ĵĴ���Խ��,������Խǿ,Խ�����ڳ������չ
		 */
		Collections.sort(list);// ���򼯺�
		System.out.println(list);
	}

}
