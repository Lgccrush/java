package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * ȡ�Ӽ� List suList(int start,int end) ��ȡ��ǰ������ָ����Χ�ڵ��Ӽ�,����ͷ������β
 * 
 * @author L
 *
 */
public class ListDemo3 {

	public static void main(String[] args) {
		// ����һ����List����
		List<Integer> list = new ArrayList<Integer>();
		// ���Ԫ��0-9
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		// ��ȡ#3-7
		List<Integer> subList = list.subList(3, 8);
		System.out.println(list);
		System.out.println(subList);

		// ��ÿ��Ԫ������10��
		for (int i = 0; i < subList.size(); i++) {// ��������
			int n = subList.get(i);// �Ѽ���ÿ��Ԫ��ȡ��
			n = n * 10;// Ȼ������10��
			subList.set(i, n);// ��ÿ��Ԫ�طŻ�
		}
		System.out.println(subList);// �õ�����10���¼���
		/*
		 * ���Ӽ����޸�,�����޸�ԭ���ϵ���Ӧ����
		 */
		System.out.println(list);// ��ȡǰ����Ҳ���޸�
		/*
		 * ɾ�����ϲ���Ԫ�� Ҫ��:ɾ������2-8
		 */
		list.subList(2, 9).clear();// ��ԭ���Ͻ�ȡ���������
		System.out.println(list);// �õ���ȡ��ļ���
	}

}
