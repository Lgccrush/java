package day09;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * static void sleep(long ms) �߳��ṩ�ķ���sleep����ʹ���и÷������߳̽�������״ָ̬������,
 * ��ʱ����Զ��ص�runnable״̬.
 * 
 * @author L
 *
 */
public class ThreadDemo7 {

	public static void main(String[] args) {
		/**
		 * ��ɵ��ӱ��� ÿ�����һ�ε�ǰʱ�� xx:xx:xx
		 */
		//�Լ�д��
		/*while (true) {
			try {
				Date now = new Date();// ��ȡϵͳ��ǰʱ��
				
				 * Calendar c = Calendar.getInstance(); c.setTime(now);
				 String str = "HH:mm:ss";// ����ʱ���ʽ
				SimpleDateFormat sdf = new SimpleDateFormat(str);
				Thread.sleep(1000);// �����߳�����ʱ��
				System.out.println(sdf.format(now));// ת�������
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}*/
		//��ʦд��
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");//����ʱ���ʽ
		while (true) {
			try {
				Thread.sleep(1000);
				System.out.println(sdf.format(new Date()));//��ȡ��ǰʱ�䲢���
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}

	}

}
