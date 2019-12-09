package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����תΪ���� ��Ҫע��,ת��ֻ��ת��ΪList���� ʹ�õ������鹤����Arrays�ľ�̬����asList
 * ֻ��ת��ΪList����Ҫԭ����:set���ܴ���ظ�Ԫ�� ������ת��ΪSet���Ͽ��ܳ���Ԫ�ض�ʧ�����
 * 
 * @author L
 *
 */
public class ArrayToListDemo {

	public static void main(String[] args) {
		String[] array = { "one", "tow", "three", "four" };// ����һ������

		List<String> list = Arrays.asList(array);// ������ת��Ϊ����
		System.out.println(list);
		// �򼯺����Ԫ��
		/*
		 * ���������׳��쳣,ԭ�����ڸü���ʱ����ת���� �ü��ϱ�ʾԭ����,���ԶԼ��ϵĲ������Ƕ�����Ĳ���
		 * ��ô���Ԫ�ػᵼ����������,��ô�Ͳ��ܱ�ʾԭ�������� ���Բ�������ü�������µ�Ԫ��
		 */
		// list.add("five");
		// System.out.println(list);
		// �޸ļ���Ԫ��
		list.set(1, "2");
		System.out.println(list);
		// �޸ļ���Ԫ��,����Ҳ���޸�
		for (String string : array) {
			System.out.println(string);
		}
		/*
		 * ��ϣ����ɾԪ��,��Ҫ���ⴴ���¼���
		 */
		// List<String> list2 = new ArrayList<String>();
		// list2.addAll(list);
		/*
		 * ���еļ��϶��ṩ��һ������Collection ���Ͳ����Ĺ��췽�� �ù��췽������Ϊ:���ƹ�����
		 * �����Ǵ����ü��ϵ�ͬʱ,���ϰ����������ϵ�����Ԫ��
		 */
		List<String> list2 = new ArrayList<String>(list);
		list2.add("five");
		System.out.println(list2);
	}

}
