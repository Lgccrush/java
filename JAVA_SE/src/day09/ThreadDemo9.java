package day09;
/*
 * void join()
 * join��������ʹ���ø÷����Ľ��̽�������״̬,
 * ֱ���÷�������������ɹ����Ż������ø÷����̵߳�����״̬,
 * jion����һ��������ɶ���߳�֮��ͬ����������
 */
public class ThreadDemo9 {
	//��ʾͼƬ�Ƿ��������
	public static boolean isFinish = false;
	public static void main(String[] args) {
		Thread download = new Thread(){
			public void run() {
				System.out.println("��ʼ����ͼƬ");
				for (int i = 0; i <= 100; i++) {
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				System.out.println("down:ͼƬ���سɹ�");
				isFinish = true;
			}
		};
		Thread show = new Thread(){
			public void run() {
				System.out.println("��ʼ��ʾͼƬ");
				/**
				 * �ȵȴ�download��ͼƬ�������
				 */
				try {
					download.join();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				if (!isFinish) {
					throw new RuntimeException("ͼƬû���������");
				}
				System.out.println("show:ͼƬ��ʾ���");
			}
		};
		
		download.start();
		show.start();
	}

}
