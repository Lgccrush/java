package day04Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ����һ������,���Ԫ��"1","$","2","$","3","$","4", ʹ�õ�������������,���ڹ�����ɾ������"$"
 * ���ɾ��Ԫ�صļ���ʹ����ѭ������,�����ÿһ��Ԫ��
 * 
 * @author L
 *
 */
public class day04Test2 {

	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<String>();// ��������C1
		// ���Ԫ��
		c1.add("1");
		c1.add("$");
		c1.add("2");
		c1.add("$");
		c1.add("3");
		c1.add("$");
		c1.add("4");
		Iterator<String> i1 = c1.iterator();// ��ȡ������
		while (i1.hasNext()) {// ����
			String str1 = (String) i1.next();
			if ("$".equals(str1)) {// �жϲ�ɾ��Ԫ��"$"
				i1.remove();
			}
		}
		System.out.println(c1);// �õ��µļ���
	}

}
