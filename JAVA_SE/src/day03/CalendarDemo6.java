package day03;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar�ṩ��Բ�ͬʱ�������������ֵ�÷��� void set(int field,int value)
 * ���е�һ������Ϊ:ʱ�����,����:��,��,�յȵ� �ڶ�������Ϊ��Ӧ��ֵ ʱ�������һ��intֵ,ʹ��calendar�ṩ�ĳ���
 * 
 * @author L
 *
 */
public class CalendarDemo6 {

	public static void main(String[] args) {
		// Calendar��ʾ��ǰʱ��
		Calendar calendar = Calendar.getInstance();
		// Date date = calendar.getTime();// Date��ʾ��ǰʱ��
		/*
		 * ����Calendar 2008-08-08 20:08:08
		 */
		// ������
		calendar.set(calendar.YEAR, 2008);
		System.out.println(calendar.getTime());
		/*
		 * ������ �´�0��ʼ��,0��ʾ1�� ���߿���ʹ�þ����µĳ���
		 */
		calendar.set(calendar.MONTH, 7);
		// calendar.set( calendar.MONTH, calendar .AUGUST);
		System.out.println(calendar.getTime());
		/*
		 * ������ ��Ӧ��ʱ��������õ�: DATE:������ DAY_OF_MONTH:���е���,��DATEһ��
		 * DAY_OF_WEEK:���е���,���ڼ� DAY_OF_YEAR:���е���
		 */
		// ������
		calendar.set(calendar.DAY_OF_MONTH, 8);
		System.out.println(calendar.getTime());
		// ����ʱ����
		calendar.set(calendar.HOUR_OF_DAY, 20);
		calendar.set(calendar.MINUTE, 8);
		calendar.set(calendar.SECOND, 8);
		System.out.println(calendar.getTime());
	}

}