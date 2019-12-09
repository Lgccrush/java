package day01StingMethod;

import javax.print.attribute.standard.Sides;

/**
 * StringBuilder�ṩ�������޸��ַ������ݵ���ط���
 * ���ڲ�ά������һ���ɱ���ַ�����,
 * �����޸Ķ����ڵ�ǰ�����ڲ���ɵ�
 * ��Ƶ���޸��ַ�������ʱӦ��ʹ�õ�ǰ�����
 * @author L
 *
 */
public class StringBuilderDemo1 {

	public static void main(String[] args) {
		String s1 = "Ŭ��ѧϰJava";
		/*
		 * ��Stringת��ΪStringbuilder
		 * ����ʹ���вεĹ��췽��
		 * StringBuilderҲ���޲ι��췽��,Ĭ�ϱ�ʾ���ַ���
		 */
		StringBuilder sBuilder = new StringBuilder(s1);
		
		/*
		 * ��StringBuilderת��ΪString
		 * ʹ��StringBuilder��������
		 */
		
		String s2 = sBuilder.toString();
		
		/*
		 * StringBuilder append(String str)
		 * ��ǰ�ַ���ĩβ׷��ָ������
		 * ���������ط���,�������Ͳ�ͬ,��Щ���ط�������׷����������
		 * (��ת��Ϊ�ַ�����׷��)
		 * 
		 */
		sBuilder.append(",Ϊ���Ҹ��ù���");
		System.out.println(sBuilder.toString());
		
		/*
		 * StringBuild replace(int strat,int end,String str)
		 * ��ָ����Χ�ڵ��ַ����滻Ϊָ��������
		 * ����ͷ������β
		 * Ŭ��ѧϰjava,Ϊ���Ҹ��ù���
		 * ��Ϊ
		 *Ŭ��ѧϰjava,����Ϊ�˸ı����� 
		 */
		sBuilder.replace(9, 16, "����Ϊ�˸ı�����");
		System.out.println(sBuilder.toString());
		
		
		/*
		 * StringBuilder delete(int start,int end)
		 * ����ǰ�ַ�����ָ����Χ�ڵ�����ɾ��
		 *  Ŭ��ѧϰjava,����Ϊ�˸ı����� 
		 * ��Ϊ
		 *  ,����Ϊ�˸ı����� 
		 */
		sBuilder.delete(0, 8);
		System.out.println(sBuilder.toString());
		
		
		/*StringBuilder insert(int index,String str)
		 * �������ַ�������ָ��λ��
		 * ԭλ�ü������ַ���˳������ƶ�
		 * ,����Ϊ�˸ı����� 
		 * ��Ϊ
		 *����,����Ϊ�˸ı����� 
		 */
		sBuilder.insert(0, "����");
		System.out.println(sBuilder.toString());
		/*
		 * ��ת�ַ���
		 * StringBuilder reverse()
		 */
		sBuilder.reverse();
		System.out.println(sBuilder.toString());
	}
}
