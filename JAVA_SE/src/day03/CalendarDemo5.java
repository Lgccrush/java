package day03;

import java.util.Calendar;

/**
 * Calendar�м���ʱ��ķ���
 * void add(int field,intvalue)
 * ��ָ����ʱ��������ϸ�����ֵ,����Ǹ���,���ȥ����ֵ
 * @author L
 *
 */
public class CalendarDemo5 {

	public static void main(String[] args) {
		/*
		 * �鿴3��2������8��������
		 */
		Calendar calendar = Calendar.getInstance();//��ȡcalendar
		calendar.add(calendar.YEAR, 3);//�鿴3���
		System.out.println(calendar.getTime());
		calendar.add(calendar.MONTH, 2);//�ٲ鿴2����
		System.out.println(calendar.getTime());
		calendar.add(calendar.DAY_OF_YEAR, 20);//�鿴���������� ��Ϊ���ܿ�����
		System.out.println(calendar.getTime());
		calendar.add(calendar.HOUR_OF_DAY, -1);//�鿴һСʱǰ
		System.out.println(calendar.getTime());
		
		/*
		 * ���������ƿ�������:
		 * Ҫ���û�����һ������,Ȼ��Ը����ڽ���һϵ�в���
		 * �ٽ����������ڷ��ظ��û�
		 * ��������
		 * 1��ȡ�û������ʱ���ַ���
		 * 2ʹ��SimpleDateFormat����ת��ΪDate����
		 * 3����һ��Calendar,ʹ���ʾDate��ʾ������
		 * 4ʹ��Calendar���������������
		 * ��Calendarת��ΪDate
		 * ʹ��SimpleDateFormat��DateתΪ�ַ������ظ��û�
		 */
	}

}
