package day09;
/**
 * �߳����ȼ�
 * �̵߳�ʱ��Ƭ������ȫ���̵߳��ȵ�,�߳�ֻ�ܱ����ķ���ʱ��,
 * �����̵߳��ȵĹ������ܸ�Ԥ,
 * ���ǿ���ͨ������̵߳����ȼ����ﵽ�����ܸ�Ԥ��Ŀ��,
 * ������,���ȼ�Խ�ߵ��߳�,��ȡCPUʱ��Ƭ�Ĵ�����Խ��
 * @author L
 *
 */
public class ThreadDemo6 {

	public static void main(String[] args) {
		//����3���߳�
		Thread min = new Thread(){
			public void run() {
				for (int i = 0; i < 1000; i++) {
					
					System.out.println("min");
				}
			}
		};
		
		Thread norm = new Thread(){
			public void run() {
				for (int i = 0; i < 1000; i++) {
					
					System.out.println("nor");
				}
			}
		};
		
		Thread max = new Thread(){
			public void run() {
				for (int i = 0; i < 1000; i++) {
					
					System.out.println("max");
				}
			}
		};
		//�������ȼ�
		min.setPriority(Thread.MIN_PRIORITY);
		max.setPriority(Thread.MAX_PRIORITY);
		//����start����
		max.start();
		min.start();
		norm.start();
	}

}
