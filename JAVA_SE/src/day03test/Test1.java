package day03test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Ҫ�� �û������Լ������� ��ʽΪ1993-10-18 ���㵽������˶����� ����10000�컹�ж����� 10000�ļ�������xxxx��xx��xx��
 * 
 * @author L
 *
 */
public class Test1 {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������");
		String line = scanner.nextLine();// ��ȡ�û�����
		Date now = new Date();// ��ȡ��ǰ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");// ָ�����ڸ�ʽ
		Date birDate = sdf.parse(line);// ���û�����תΪDate����
		long time = now.getTime() - birDate.getTime();// �õ�ǰ�����ȥ�û�����
		time = time / 1000 / 60 / 60 / 24;// ����ת��Ϊ��
		System.out.println("��ϲ��,���Ѿ�����" + time + "����");
		System.out.println("����10000�컹��" + (10000 - time) + "��");
		long time1 = 10000 - time;// ��ȡ����10000�������
		time1 = time1 * 24 * 60 * 60 * 1000;// ת��Ϊ����
		now.setTime(time1 + now.getTime());
		System.out.println("10000�ļ�������" + sdf.format(now));
	}

}
