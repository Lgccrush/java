package day04Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ����һ��List����,���"one""tow""theree""four" ��ȡ�ڶ���Ԫ�ز���� �����ϵڶ���Ԫ������Ϊ"3" �ټ��ϵڶ���λ�ò���"2"
 * ɾ��������Ԫ��
 * 
 * @author L
 *
 */
public class day04Test3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();// ����list����
		// �򼯺����Ԫ��
		list.add("one");
		list.add("tow");
		list.add("three");
		list.add("four");
		String str = list.get(1);// ��ȡ���ϵڶ���Ԫ��
		System.out.println(str);
		list.set(1, "3");// �Ѽ��ϵڶ���Ԫ������Ϊ"3"
		System.out.println(list);
		list.add(1, "2");// �ڼ��ϵڶ���λ�ò���"2"
		System.out.println(list);
		list.remove(2);// ɾ�����ϵ�����Ԫ��
		System.out.println(list);

	}
}
