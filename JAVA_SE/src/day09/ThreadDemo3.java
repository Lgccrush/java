package day09;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * ʹ�������ڲ���ķ�ʽ����ɷ�ʽһ��ʽ�����̵߳Ĵ���
 * @author L
 *
 */
public class ThreadDemo3 {

	public static void main(String[] args) {
		//ʹ�������ڲ��ഴ���߳�
		Thread t1 = new Thread(){
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("����˭��");
				}
			}
		};
	/*	Thread t2 = new Thread(){
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("���ǲ�ˮ���");
				}
			}
		};*/
		t1.start();//����start����
//		t2.start();
		//ʹ�������ڲ��ഴ���߳�2
		Runnable r1 = new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("���ǲ�ˮ���");
				}
			}
		};
		Thread t2 = new Thread(r1);
		t2.start();//����start����
		
		new Thread( new Runnable() {
			public void run() {
			for (int i = 0; i < 1000; i++) {
				System.out.println("�����Ժ��д��");
			}	
			}
		}).start();
		
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("ҪŬ��");
				}
			}
		}).start();
	}

}
