package day03test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �鿴��ǰϵͳʱ��� 16��5Сʱ23��40���Ժ������ ��ʾ��ʽ xxxx��xx��xx�� xx:xx:xx
 * 
 * @author L
 *
 */
public class Test {

	public static void main(String[] args) {
		Date now = new Date();// ��ȡ��ǰ����
		SimpleDateFormat sdFormat = new SimpleDateFormat(
				"yyyy��-MM��-dd�� HH-mm-ss");// ָ�����ڸ�ʽ
		String date = sdFormat.format(now);// ת��ʱ���ʽ
		System.out.println("ϵͳ��ǰʱ����" + date);

		long time = now.getTime();// ��ȡlongֵ
		// ����16��5Сʱ23��40��
		time += 1000 * 60 * 60 * 24 * 16;// 16��
		time += 1000 * 60 * 60 * 5;// 5��
		time += 1000 * 60 * 23;// 23��
		time += 1000 * 40;// 40��
		now.setTime(time);
		String date1 = sdFormat.format(now);// ת��ʱ���ʽ
		System.out.println("16��5Сʱ23��40��ϵͳ��ǰʱ����" + date1);
	}

}
