package day03;

import java.util.Calendar;

/**
 * ��ȡһ��Calendar��ʾ�������� ����ʱ�������Ӧ��ֵ
 * 
 * @author L
 *
 */
public class CalendarDemo3 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();// ��ȡһ��Calendar
		/*
		 * int get(int field) ��ȡ��Ӧʱ�������ֵ
		 */
		int year = calendar.get(calendar.YEAR);// ��ȡ��
		int month = calendar.get(calendar.MONTH) + 1;// ��ȡ��
		int day = calendar.get(calendar.DATE);// ��ȡ��
		System.out.println(year + "-" + month + "-" + day);
		int hour = calendar.get(calendar.HOUR_OF_DAY);// ��ȡʱ
		int minite = calendar.get(calendar.MINUTE);// ��ȡ��
		int second = calendar.get(calendar.SECOND);// ��ȡ��
		System.out.println(hour + ":" + minite + ":" + second);
		// �鿴���ڼ�
		Calendar calendar2 = calendar.getInstance();
		int day1 = calendar.get(calendar.DAY_OF_WEEK);// ��ȡ���ڼ�,������Ϊ��һ��
		System.out.println("��" + (day1 == 7 ? 1 : day1 - 1));
		String[] strings = { "��", "һ", "��", "��", "��", "��", "��", };
		System.out.println("��" + strings[day1 - 1]);
		// �鿴������˶�����
		int day2 = calendar.get(calendar.DAY_OF_YEAR);// ��ȡһ����˶�����
		System.out.println(year + "���Ѿ�����" + day2 + "��");
	}

}
