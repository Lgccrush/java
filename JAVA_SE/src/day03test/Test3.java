package day03test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ��ϰ
 * 
 * @author L
 *
 */
public class Test3 {

	public static void main(String[] args) throws ParseException {
		// ����ǰϵͳʱ����"yyyy-MM-dd HH:mm:ss"��ʽ���
		/*
		 * Date nowDate = new Date();//����Date���� System.out.println(nowDate);
		 * String s = "yyyy-MM-dd HH:mm:ss";//ָ����ʽ SimpleDateFormat sdf = new
		 * SimpleDateFormat(s);//����SimpleDateFormat����
		 * System.out.println(sdf.format(nowDate));//ת����ʽ
		 */
		// ����ĳ������,��ʽΪ"yyyy-MM-dd",���������Ϊֹ�����Ķ�����
		Scanner sc = new Scanner(System.in);// ��������¼��
		System.out.println("����������");
		String line = sc.nextLine();// �����û������ַ���
		Date nowDate = new Date();// ����Date����
		String s = "yyyy-MM-dd";// ָ����ʽ
		SimpleDateFormat sdf = new SimpleDateFormat(s);
		Date date = sdf.parse(line);// ת���ַ���ΪDate����
		long nowTime = nowDate.getTime();// ��ȡ�û�����ֵ
		long dateTime = date.getTime();// ��ȡ��ǰ����ֵ
		long week = (nowTime - dateTime) / 7 / 24 / 60 / 60 / 1000;// �ó���
		System.out.println("������" + week + "����");

	}

}
