package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * �����ϻ�mapת��Ϊ�̰߳�ȫ��
 * 
 * API�ֲ�����˵��,�����̰߳�ȫ�ļ���,
 * ���ж���Ԫ�صĲ���,��add,remove,�ȷ����������������������,
 * ��Ҫ����ά�������ϵ
 * @author L
 *
 */
public class SynDemo5 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("fore");
		
		 list = Collections.synchronizedList(list);//�Ѽ���ת��Ϊ�̰߳�ȫ��
		 
		 Set<String> set = new HashSet<String>(list);//���췽�����켯��
		 set = Collections.synchronizedSet(set);//��set����ת��Ϊ�̰߳�ȫ��
		 //HashMap�����̰߳�ȫ��
		 Map< String, Integer > map = new HashMap<String, Integer>();
		 map.put("����", 99);
		 map.put("��ѧ", 98);
		 map.put("Ӣ��", 97);
		 map = Collections.synchronizedMap(map);//��mapת�����̰߳�ȫ��
	}

}
