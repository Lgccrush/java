package day10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̳߳���Ҫ����������:
 * 1:�����߳�
 * 2:�����߳�����
 * �����ǵ�Ӧ����Ҫ���������̻߳��߷����̻߳�Ƶ������������ʱ,
 * Ӧ������ʹ���̳߳���ά���߳�
 * @author L
 *
 */
public class ThreadPlooDemo1 {

	public static void main(String[] args) {
		//�����̳߳�
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		
		for (int i = 0; i < 5; i++) {
			Runnable runn = new Runnable() {
				public void run() {
					Thread t = Thread.currentThread();
				try {
					System.out.println(t.getName()+"������������");	
					Thread.sleep(5000);
					System.out.println(t.getName()+"�����������");
				} catch (Exception e) {
					System.out.println("�̱߳��ж���");//�׳����ж��쳣
				}
				}
			};
			threadPool.execute(runn);//�̳߳���������
		}
		
		System.out.println("ָ����һ��������̳߳�");
		threadPool.shutdownNow();//�����ж��������е��߳�
//		threadPool.shutdown();//�ж��̳߳�,�̳߳ػ���������ֹͣ����
		System.out.println("�ж��߳�����");
	}

}
