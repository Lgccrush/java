package day03;

import java.util.Calendar;

/**
 * ��ȡĳһ��ʱ���������������ֵ
 * @author L
 *
 */
public class CalendarDemo4 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();//��ȡһ��Calendar
		int maximum = calendar.getActualMaximum(calendar.DAY_OF_MONTH);//�����ж�����
		System.out.println(maximum);
		
		calendar.set(calendar.MONTH, 1);//���õ�ǰ��Ϊ2��
		int days = calendar.getActualMaximum(calendar.DAY_OF_MONTH);//��ȡ�����������ֵ
		System.out.println(days);
		
		int day2 = calendar.getActualMaximum(calendar.DAY_OF_YEAR);//��ȡһ���ж�����
		System.out.println(day2);
	}

}
