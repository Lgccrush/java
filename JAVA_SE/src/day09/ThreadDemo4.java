package day09;
/**
 * static Thread currentThread()
 * ��ȡ���е�ǰ�������߳�
 * @author L
 *
 */
public class ThreadDemo4 {

	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		System.out.println("����main�������߳���:"+main);
		
		dosome();
		Thread t = new Thread(){
			public void run() {
				Thread t = Thread.currentThread();
				System.out.println("�����Զ����̵߳ķ�����:"+t);
				dosome();
			}
		};
		t.start();
	}
	public static void dosome() {
		Thread t = Thread.currentThread();
		System.out.println("����dosome�������߳���:"+t);
	}

}
