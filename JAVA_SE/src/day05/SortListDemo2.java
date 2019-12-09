package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo2 {

	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();//����string���ͼ���
		//���Ԫ��
		list.add("����ʦ");
		list.add("����ʦ");
		list.add("С����ʦ");
		System.out.println(list);
//		Collections.sort(list);//Ԫ������
		/**
		 * ���ص�sort����Ҫ����һ������ıȽ���,
		 * �÷�������Ҫ�󼯺�Ԫ�ر���ʵ��Comparable�ӿ�,
		 * ����Ҳ����ʹ�ü���Ԫ������ıȽϹ���������,
		 * ���Ǹ�������������������Ƚ����ıȽϹ���Լ���Ԫ�ؽ�������,
		 * ʵ�ʿ�����Ҳ�Ƽ����ַ�ʽ����Ԫ��,������Ԫ�����Զ����,
		 * �����Ƚ����Ƽ�ʹ�������ڲ������ʽ
		 */
		MyComparable com = new MyComparable();
		Collections.sort(list, com);
		System.out.println(list);
		//�����ڲ������ʽ����
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1,String  o2) {
				//��д���� �ַ��ٵĴ�
				return o2.length()-o1.length();
			}
			
		});
		System.out.println(list);
	}

}
class MyComparable implements Comparator<String>{

	/**
	 * �÷���ԭ������o1��o2 �ǱȽ�
	 * ������ֵ>0:o1>o2
	 * ������ֵ<0:o1<o2
	 * ������ֵ=0:�����������
	 */
	public int compare(String o1, String o2) {
		/*
		 * �ַ������ַ���Ĵ�
		 */
		return o1.length()-o2.length();
	}

	

	
	}
	

