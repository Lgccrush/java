package day04Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ����һ��List���ϲ����Ԫ��0-9 Ȼ��ȡ�Ӽ�[3,4,5,6] Ȼ���Ӽ�Ԫ������10�� Ȼ�����ԭ���� ֮��ɾ�������е�[7,8,9]
 * 
 * @author L
 *
 */
public class day04Test4 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();// ����list����
		for (int i = 0; i < 10; i++) {
			list.add(i);// �򼯺����Ԫ��0-9
		}
		System.out.println(list);
		List<Integer> sublist = list.subList(3, 7);// ��ȡ�Ӽ�
		System.out.println(sublist);
		for (int i = 0; i < sublist.size(); i++) {// ��������Ԫ������10��
		// int n = sublist.get(i);
		// n = n *10;
		// sublist.set(i, n);
			sublist.set(i, sublist.get(i) * 10);
		}
		System.out.println(list);// �¼���Ԫ��Ҳ�ı�
		list.removeAll(list.subList(7, 10));// ɾ��[7,8,9]
		System.out.println(list);

	}

}
