package day09;
/**
 * �ػ��߳�,�ֳ�Ϊ��̨�߳�
 * ��һ�����������е�ǰ̨�̶߳�����ʱ,���̾�Ҫ����,�����к�̨�߳�,
 * ��ô��̨�̻߳ᱻǿת����
 * @author L
 *
 */
public class ThreadDemo8 {

	public static void main(String[] args) {
		//rose:ǰ̨�߳�
		Thread rose = new Thread(){
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				System.out.println("��������������AAAaaaaaa");
				System.out.println("��Ч:��ͨ...");
			}
		};
		
		Thread jake = new Thread(){
			public void run() {
				while (true) {
					System.out.println("you jum! I jum");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		};
		//����JakeΪ�ػ��߳�.Ҫ��startǰ����
		jake.setDaemon(true);
		rose.start();
		jake.start();
		/*
		 * ����main�����ͽ���
		 * main������ǰ̨�߳� ֻҪ��ǰ̨�̻߳��� ��̨�߳̾ͻ���
		 */
		while(true);
	}

}
