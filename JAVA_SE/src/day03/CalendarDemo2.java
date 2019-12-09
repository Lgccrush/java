package day03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar ������ ������һ��������,��װ�˶�ʱ�����ز��� ���õ�ʵ������������(����) ʹ��
 * ��������Ϊ�˶�ʱ�������ز��� �������ʱ��
 * 
 * @author L
 *
 */
public class CalendarDemo2 {

	public static void main(String[] args) {
		/*
		 * ʹ��Calender�ľ�̬��������ʵ�� �÷�������ݵ�ǰϵͳ���ڵ�������һ����Ӧ��ʵ��
		 * ͨ��GregorianCalendarĬ�ϴ���������ʵ����ʾ��ǰϵͳʱ��
		 */
		Calendar calendar = Calendar.getInstance();
		/*
		 * toString����ֱ�۷�ӳ��ʾ������
		 */
		System.out.println(calendar);

		/*
		 * Calendar��Date֮��Ļ�ת Calendar�ṩ�˷���getTime,�÷�������һ��Date����
		 * �ö����ʾ��ʱ����ǵ�ǰCalendar��ʾ��ʱ��
		 */
		Date date = calendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		/*
		 * ��ʾ������һʱ��
		 */
		date.setTime(date.getTime() + 1000 * 60 * 60 * 24);

		System.out.println(sdf.format(date));
		/*
		 * Date--->Calendar void setTime(Date date)
		 * Calendar��setTime��������ʹ��ǰCalendar��ʾ������Date����ʾ��ʱ��
		 */
		// CalendarҲ��ʾ������һʱ��
		calendar.setTime(date);
	}

}
