package day05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ����Map
 * ��3�ַ�ʽ
 * �������е�key
 * �������е�key-value��
 * �������е�value(������)
 * @author L
 *
 */
public class MapDemo2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();//����map����
		//���Ԫ��
		map.put("����", 99);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 97);
		map.put("����", 96);
		map.put("��ѧ", 99);
		System.out.println(map);
		
		/*
		 * �������е�kye
		 * set<k> keySet
		 * �÷����Ὣ��ǰmap�����е�key����һ��set���Ϻ󷵻�,
		 * ��ô�������Ͼ��൱�ڱ��������е�key
		 */
		Set<String> keysSet = map.keySet();//�õ����������е�key����set������
		for (String key: keysSet) {
			System.out.println("key:"+key);
		}
		/*
		 * ����ÿһ���ֵ��
		 * map��ÿһ���ֵ�Զ�����map���ڲ���:
		 * java.util.Map.Entry��ÿһ��ʵ����ʾ��
		 * Entry����������:getKey getVelue,
		 * ���Էֱ���һ���ֵ���е�key��velue
		 * 
		 * Set<Entry>entrySet
		 * �÷����ὫMap��ÿһ����ֵ��(entryʵ��)
		 * ����һ��Set���Ϸ���
		 */
		//��map�ļ�ֵ�Դ���set������
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {//�������� �õ�ÿһ����ֵ��
			String key = entry.getKey();
			Integer velue = entry.getValue();
			System.out.println("key:"+key+"velue:"+velue);
		}
		/*
		 * �������е�value
		 * Collection values
		 * �÷����Ὣ��ǰMap�����е�value����һ�����Ϻ󷵻�
		 */
		Collection<Integer> values = map.values();//��ȡ���е�value
		//����
		for (Integer value : values) {
			System.out.println(value);
		}
	}

}
