package day09;
/**
 * ��һ�ִ����̵߳ķ�ʽ
 * �̳�Thread����дrun�����������߳�Ҫִ�е����� 
 * 
 * ���ַ�ʽ���� �߳������㲻��
 * 1:����java�ǵ��̳�.��ô�̳�Thread���޷��̳�������
 * 2:���ڼ̳�ThreadҪ��дrun�����涨���߳�Ҫִ������,
 * �⵼���̺߳�������һ����Ȼ������͹�ϵ.�������̵߳�����
 * @author L
 *
 */
public class ThreadDemo1 {

	public static void main(String[] args) {
		//�����߳�
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		/**
		 * �����̵߳���start����,������run����.
		 * run�������߳�ִ�е�����,���߳�start���������ú�
		 * �߳̽���runnable״̬,һ����ȡCPUʱ��
		 * run�������Զ�������
		 */
		 //����start����
		t1.start();
		t2.start();
	}

}
//�̳�Tread
class MyThread1 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("����˭��?");
		}
	}
	
	
}
class MyThread2 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("���ǲ�ˮ���");
		}
	}
	
	
}
