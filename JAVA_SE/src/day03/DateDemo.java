package day03;

import java.util.Date;

/**
 * Date��ÿһ��ʵ�����ڱ�ʾһ��ȷ�е�ʱ���
 * �ڲ�ά����һ��longֵ,��ֵ��¼���Ǵ�1970��1��1�յ���ʾ��ʱ���֮���������ĺ���ֵ
 * ������70���Ժ������,������70����ǰ������
 * ����Date���������ȱ��(ʱ��,ǧ���)�������Ĵ󲿷ַ�������Ϊ�ѹ���,������ʹ��
 * @author L
 *
 */
public class DateDemo {

	public static void main(String[] args) {
		/*
		 * Date ��д��toString����
		 * �����ַ�����ʾ���ǵ�ǰ��ʾ��ʱ���ʽ(�����Ѻ�)
		 */
		Date now = new Date();
		System.out.println(now);
		//��ȡDate�ڲ�ά����longֵ
		long time = now.getTime();
		System.out.println(time);
		 time += 1000*60*60*24;//һ��ĺ���ֵ
		now.setTime(time);//���õ�ǰ�����һ��Ϊ����
		System.out.println(now);
	}

}
