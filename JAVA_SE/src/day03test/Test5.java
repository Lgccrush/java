package day03test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * //����һ����������"yyyy-MM-dd",������һ������(�����ڵ�����),
 * 
 * //Ȼ�󾭹������������ʱ��,����ʱ��Ϊ:����Ʒ������ǰ2�ܵ���3
 * 
 * @author L
 *
 */
public class Test5 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);// ��������¼�����
		System.out.println("��������������");
		String date = sc.nextLine();// �����û�������������
		System.out.println("���䱣����");
		Scanner sc1 = new Scanner(System.in);// ��������¼�����
		int days = Integer.parseInt(sc1.nextLine());// �����û�����ı����ڲ�ת��Ϊ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");// �������ڸ�ʽ
		Date date2 = sdf.parse(date);// ���û�������������ת��ΪDate����
		Calendar calendar = Calendar.getInstance();// �������������ڼ���
		calendar.setTime(date2);// ��Dateת��Ϊ��������
		calendar.add(calendar.DAY_OF_YEAR, days);// ���㱣����
		calendar.add(calendar.DAY_OF_YEAR, -14);// ���㱣����ǰ����
		calendar.add(calendar.DAY_OF_WEEK, 4);// ���㱣����ǰ����������
		String day = sdf.format(calendar.getTime());// ��Calendarת��ΪDate������תΪ�ַ���
		System.out.println("��������" + day);

	}

}
