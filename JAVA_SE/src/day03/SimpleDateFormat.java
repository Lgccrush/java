package day03;

import java.util.Date;

/**
 * ��Date���ڸ�ʽ��
 * 
 * @author L
 *
 */
public class SimpleDateFormat {

	public static void main(String[] args) {
		Date now = new Date();// ��ȡ��ǰ����
		java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(
				"yyyy-MM-dd HH-mm-ss");// ָ�����ڸ�ʽ
		/*
		 * Dateת��ΪString format �������Խ�����Date��������ʾ��ʱ��
		 * ����SimpleDateFormatָ�����ڸ�ʽת��ΪString�ַ���
		 */
		String string = simpleDateFormat.format(now);// ת��ʱ���ʽ
		System.out.println(string);

	}

}
