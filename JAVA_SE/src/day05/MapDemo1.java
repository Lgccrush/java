package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map Map��������һ���������еı��. ��key-value�Ե���ʽ���Ԫ��
 * ��Map��Key�����ظ�(�ظ�������key��equals�ж�) ���õ�ʵ������:HasMap
 * 
 * @author L
 *
 */
public class MapDemo1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();// ����һ��hasmap����
		// ���Ԫ��
		/*
		 * V put(K k ,V v) ��������key-value�Դ���Map
		 * ����mapҪ��key�����ظ�,����ʹ��map���е�key����һ���µ�value�Ĳ������滻value
		 * ��ô����ֵΪ��keyԭ����Ӧ��value,����һ���µ�key,����ֵΪnull
		 */
//		int value = map.put("����", 98);�Զ����� null.intValue()
		Integer value = map.put("����", 99);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 97);
		map.put("����", 96);
		map.put("��ѧ", 99);
		System.out.println(map);
		
		value = map.put("����", 98);//�滻
		System.out.println(map);
		System.out.println(value);
		
		/*
		 * V get (K k)
		 * ���ݸ�����key��ȡ��Ӧ��value
		 * ����ǰmapû�и�����key ����ֵΪnull
		 */
		value =map.get("��Ϥ");//��ȡkey��Ӧ��value
		System.out.println(value);
		value =map.get("��ѧ");//��ȡkey��Ӧ��value
		System.out.println(value);
		
		/*
		 * V remove(K k)
		 * ɾ��������key��Ӧ��key-value��
		 * ����ֵΪ��ɾ����key-value�Ե�value
		 */
		
		System.out.println("ɾ����ѧ");
		value = map.remove("��ѧ");//ɾ����ѧkey-value
		System.out.println(map);
		System.out.println("old:"+value);
	}

}
